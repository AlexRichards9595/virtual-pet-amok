package petshelter;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetTest {
	
	
	
	@Test
	public void shouldCreateAPetWithNameDescriptionAndHealth() {
		VirtualPet underTest = new VirtualPet ("", "", 20);
		
		assertNotNull(underTest);
	}
	@Test
	public void assertThatAPetHasBeenAdded() {
		VirtualPet underTest = new VirtualPet("Steve", "Description", 20);
		OrgDog orgDog = new OrgDog (underTest.name,underTest.description,underTest.health,20,20,20,20);
		underTest.addPet(orgDog);
		Collection<VirtualPet> check = underTest.getAllPets();
		assertThat(check, contains(orgDog));
		
	}
	
	

}
