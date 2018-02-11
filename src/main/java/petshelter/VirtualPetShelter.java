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
		for (VirtualPet virtualPet : getAllPets()) {
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).feed();
			}
		}
	}

	public void waterAllPets() {
		for (VirtualPet virtualPet : getAllPets()) {
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).water();
			}
		}
	}

	public void tickAllPets() {
		for (VirtualPet virtualPet : getAllPets()) {
			if (virtualPet instanceof OrgDog) {
				((OrgDog) virtualPet).tick();
			}
			if (virtualPet instanceof OrgCat) {
				((OrgCat) virtualPet).tick();
			}
			if (virtualPet instanceof Robotic) {
				((Robotic) virtualPet).tick();
			}
		}
	}

	public void oilAllRobotPets() {
		for (VirtualPet virtualPet : getAllPets()) {
			if (virtualPet instanceof Robotic) {
				((Robotic) virtualPet).oilPet();
			}
		}
	}

	public void playWithPet(String name) {
		VirtualPet virtualPet = pets.get(name);
		if (virtualPet instanceof Organic) {
			((Organic) virtualPet).play();
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public void cleanAllCages() {
		for (VirtualPet virtualPet : getAllPets()) {
			if (virtualPet instanceof OrgDog) {
				((OrgDog) virtualPet).cleanCage();
			}
		}
	}

	public int getLitterBoxWaste() {
		int totalWaste = 0;
		for (VirtualPet virtualPet : getAllPets()) {
			if (virtualPet instanceof OrgCat) {
				totalWaste += ((OrgCat) virtualPet).getWaste();
			}
		}
		return totalWaste;
	}

	public void cleanLitterBox() {
		for (VirtualPet virtualPet : getAllPets()) {
			if (virtualPet instanceof OrgCat) {
				((OrgCat) virtualPet).removeWaste();
			}
		}
	}

}
