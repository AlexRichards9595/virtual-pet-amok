package petshelter;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {
	
	VirtualPetShelter underTest = new VirtualPetShelter();

	@Test
	public void shouldCreateAPet() {
		VirtualPet underTest = new OrgDog("name", "description", 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}

	@Test
	public void assertThatAPetHasBeenAdded() {
		Organic orgDog = new OrgDog("name", "description", 20, 20, 20, 20, 20);
		underTest.addPet(orgDog);
		Collection<VirtualPet> check = underTest.getAllPets();
		assertThat(check, contains(orgDog));

	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		Organic orgDog = new OrgDog("name", "description", 20, 20, 20, 20, 20);
		OrgCat orgCat = new OrgCat("steve", "description", 20, 20, 20, 20,20);
		underTest.addPet(orgDog);
		underTest.addPet(orgCat);
		Collection<VirtualPet> check = underTest.getAllPets();

		assertThat(check, containsInAnyOrder(orgDog, orgCat));
	}

	@Test
	public void shouldBeAbleToRemovePet() {
		Organic orgDog = new OrgDog("name", "description", 20, 20, 20, 20, 20);
		OrgCat orgCat = new OrgCat("steve", "description", 20, 20, 20, 20,20);
		underTest.addPet(orgDog);
		underTest.addPet(orgCat);
		underTest.removePet("steve");
		Collection<VirtualPet> check = underTest.getAllPets();

		assertThat(check, contains(orgDog));
	}
	

	@Test
	public void shouldFeedAllPets() {
		underTest.addPet(new OrgDog("Steve", "Description"));
		underTest.addPet(new OrgDog("Bob", "Description"));
		underTest.addPet(new RoboDog("Steve", "Description"));
		underTest.feedAllPets();

		for (VirtualPet virtualPet : underTest.getAllPets()) {
			if (virtualPet instanceof Organic) {
				int check = ((Organic) virtualPet).getHunger();
				assertThat(check, is(0));
			}
		}
	}
//
//	@Test
//	public void shouldWaterAPet() {
//		underTest.addPet(new VirtualPet("Steve", "Description"));
//		underTest.waterPet("Steve");
//		int check = underTest.getPetThirst("Steve");
//		assertEquals(15, check);
//	}

//	@Test
//	public void shouldWaterAllPets() {
//		underTest.addPet(new VirtualPet("Steve", "Description"));
//		underTest.addPet(new VirtualPet("Bob", "Description"));
//		underTest.waterAllPets();
//
//		for (VirtualPet virtualPet : underTest.pets()) {
//			int check = underTest.getPetThirst(virtualPet.getName());
//			assertEquals(15, check);
//		}
//	}
//
//	@Test
//	public void shouldTickAPet() {
//		underTest.addPet(new VirtualPet("Steve", "Description"));
//		underTest.tickPet("Steve");
//		int check = underTest.getPetHunger("Steve");
//		assertEquals(22, check);
//	}
//
//	@Test
//	public void shouldTickAllPets() {
//		underTest.addPet(new VirtualPet("Steve", "Description"));
//		underTest.addPet(new VirtualPet("Bob", "Description"));
//		underTest.tickAllPets();
//
//		for (VirtualPet virtualPet : underTest.pets()) {
//			int check = underTest.getPetHunger(virtualPet.getName());
//			assertEquals(22, check);
//		}
//	}
//
//	@Test
//	public void shouldPlayWithAPet() {
//		underTest.addPet(new VirtualPet("Steve", "Description"));
//		underTest.playWithPet("Steve");
//		int check = underTest.getPetBoredom("Steve");
//		assertEquals(10, check);
//	}
	
	

}
