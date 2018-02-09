package petshelter;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;



public class VirtualPetShelterTest {
	
	@Test
	public void shouldCreateAPetWithNameDescriptionAndHealth() {
		VirtualPet underTest = new VirtualPet ("", "", 20);
		
		assertNotNull(underTest);
	}
	@Test
	public void assertThatAPetHasBeenAdded() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrgDog orgDog = new OrgDog ("name","description",20,20,20,20,20);
		underTest.addPet(orgDog);
		Collection<VirtualPet> check = underTest.getAllPets();
		assertThat(check, contains(orgDog));
		
	}
	@Test
	public void shouldBeAbleToAddTwoEmployees() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrgDog orgDog = new OrgDog ("name","description",20,20,20,20,20);
		OrgCat orgCat = new OrgCat ("steve","description",20,20,20,20);
		underTest.addPet(orgDog);
		underTest.addPet(orgCat);
		Collection<VirtualPet> check = underTest.getAllPets();

		assertThat(check, containsInAnyOrder(orgDog, orgCat));
	}


}
