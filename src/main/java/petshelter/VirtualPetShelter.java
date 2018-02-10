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

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public void removePet(String name) {
		pets.remove(name);
	}

	public void feedAllPets() {
		pets.forEach((String name, VirtualPet virtualPet) -> {
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).feed();
			}
		});
	}

	public void WaterAllPets() {
		pets.forEach((String name, VirtualPet virtualPet) -> {
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).water();
			}
		});
	}

	public void TickAllPets() {
		pets.forEach((String name, VirtualPet virtualPet) -> {
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).tick();
			}
			if (virtualPet instanceof Robotic) {
				((Robotic) virtualPet).tick();
			}
		});
	}

	public void OilAllRobotPets() {
		pets.forEach((String name, VirtualPet virtualPet) -> {
			if (virtualPet instanceof Robotic) {
				((Robotic) virtualPet).oilPet();
			}
		});
	}

	public void PlayWithPet(String name) {
		VirtualPet virtualPet = pets.get(name);
		if (virtualPet instanceof Organic) {
			((Organic) virtualPet).play();
		} else {
			throw new UnsupportedOperationException();
		}
	}

}
