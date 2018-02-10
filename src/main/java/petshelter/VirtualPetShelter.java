package petshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addPet(VirtualPet virtualPet) {
		pets.put(virtualPet.name, virtualPet);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public void removePet(String name) {
		pets.remove(name);
	}

	public void feedAllPets() {
		pets.forEach((String name, VirtualPet virtualPet)-> {
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).feed();
			}
		}); 
	}

}
