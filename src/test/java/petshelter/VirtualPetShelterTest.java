package petshelter;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void shouldCreateAPet() {
		VirtualPet underTest = new OrgDog("name", "description", 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}

	@Test
	public void assertThatAPetHasBeenAdded() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		Organic orgDog = new OrgDog("name", "description", 20, 20, 20, 20, 20);
		underTest.addPet(orgDog);
		Collection<VirtualPet> check = underTest.getAllPets();
		assertThat(check, contains(orgDog));

	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		Organic orgDog = new OrgDog("name", "description", 20, 20, 20, 20, 20);
		OrgCat orgCat = new OrgCat("steve", "description", 20, 20, 20, 20);
		underTest.addPet(orgDog);
		underTest.addPet(orgCat);
		Collection<VirtualPet> check = underTest.getAllPets();

		assertThat(check, containsInAnyOrder(orgDog, orgCat));
	}

	@Test
	public void shouldBeAbleToRemovePet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		Organic orgDog = new OrgDog("name", "description", 20, 20, 20, 20, 20);
		OrgCat orgCat = new OrgCat("steve", "description", 20, 20, 20, 20);
		underTest.addPet(orgDog);
		underTest.addPet(orgCat);
		underTest.removePet("steve");
		Collection<VirtualPet> check = underTest.getAllPets();

		assertThat(check, contains(orgDog));
	}

}
