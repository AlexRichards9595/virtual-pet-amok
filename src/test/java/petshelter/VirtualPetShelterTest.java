package petshelter;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.hamcrest.Matchers;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter underTest = new VirtualPetShelter();

	@Test
	public void shouldCreateAPet() {
		VirtualPet underTest = new OrgDog("name", "description");

		assertNotNull(underTest);
	}

	@Test
	public void assertThatAPetHasBeenAdded() {
		Organic orgDog = new OrgDog("name", "description");
		underTest.addPet(orgDog);
		Collection<VirtualPet> check = underTest.getAllPets();
		assertThat(check, contains(orgDog));

	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		Organic orgDog = new OrgDog("name", "description");
		OrgCat orgCat = new OrgCat("steve", "description");
		underTest.addPet(orgDog);
		underTest.addPet(orgCat);
		Collection<VirtualPet> check = underTest.getAllPets();

		assertThat(check, containsInAnyOrder(orgDog, orgCat));
	}

	@Test
	public void shouldBeAbleToRemovePet() {
		Organic orgDog = new OrgDog("name", "description");
		OrgCat orgCat = new OrgCat("steve", "description");
		underTest.addPet(orgDog);
		underTest.addPet(orgCat);
		underTest.removePet("steve");
		Collection<VirtualPet> check = underTest.getAllPets();

		assertThat(check, contains(orgDog));
	}

	@Test
	public void shouldFeedAllOrganicPets() {
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

	@Test
	public void shouldWaterAllOrganicPets() {
		underTest.addPet(new OrgDog("Steve", "Description"));
		underTest.addPet(new OrgDog("Bob", "Description"));
		underTest.addPet(new RoboDog("Steve", "Description"));
		underTest.waterAllPets();

		for (VirtualPet virtualPet : underTest.getAllPets()) {
			if (virtualPet instanceof Organic) {
				int check = ((Organic) virtualPet).getThirst();
				assertThat(check, is(0));
			}
		}
	}

	@Test
	public void shouldOilAllRoboticPets() {
		underTest.addPet(new OrgDog("Steve", "Description"));
		underTest.addPet(new OrgDog("Bob", "Description"));
		underTest.addPet(new RoboDog("Steve", "Description"));
		underTest.oilAllRobotPets();

		for (VirtualPet virtualPet : underTest.getAllPets()) {
			if (virtualPet instanceof Robotic) {
				int check = ((Robotic) virtualPet).getOil();
				assertThat(check, is(70));
			}
		}
	}

	@Test
	public void shouldTickAllPets() {
		underTest.addPet(new OrgDog("Steve", "Description"));
		underTest.addPet(new OrgDog("Bob", "Description"));
		underTest.addPet(new RoboDog("Steve", "Description"));
		underTest.tickAllPets();

		for (VirtualPet virtualPet : underTest.getAllPets()) {
			if (virtualPet instanceof Organic) {
				int checkOrganic = ((Organic) virtualPet).getHunger();
				assertThat(checkOrganic, is(22));
			}
			if (virtualPet instanceof Robotic) {
				int checkRobotic = ((Robotic) virtualPet).getOil();
				assertThat(checkRobotic, is(18));
			}
		}
	}

	@Test(expected = UnsupportedOperationException.class)
	public void shouldPlayWithOnlyAnOrganicPet() {
		underTest.addPet(new RoboDog("Steve", "Description"));
		underTest.playWithPet("Steve");
	}

	@Test
	public void shouldCleanAllCages() {
		underTest.addPet(new OrgDog("Steve", "Description"));
		underTest.addPet(new OrgDog("Bob", "Description"));
		underTest.addPet(new RoboDog("Steve", "Description"));
		underTest.cleanAllCages();

		for (VirtualPet virtualPet : underTest.getAllPets()) {
			if (virtualPet instanceof OrgDog) {
				int check = ((OrgDog) virtualPet).getCageWaste();
				assertThat(check, is(0));
			}
		}
	}

	@Test
	public void shouldGetLitterBoxWaste() {
		int check = underTest.getLitterBoxWaste();
		assertThat(check, is(0));
	}

	@Test
	public void assertThatLitterBoxWasteGetsAllCatWaste() {
		underTest.addPet(new OrgCat("Steve", "Description"));
		underTest.addPet(new OrgCat("Bob", "Description"));
		underTest.tickAllPets();
		int check = underTest.getLitterBoxWaste();
		assertThat(check, is(4));
	}

	@Test
	public void shouldCleanLitterBox() {
		underTest.addPet(new OrgCat("Steve", "Description"));
		underTest.addPet(new OrgCat("Bob", "Description"));
		underTest.tickAllPets();
		underTest.cleanLitterBox();
		int check = underTest.getLitterBoxWaste();
		assertThat(check, is(0));
	}

	@Test
	public void shouldKillAnimalIfHealthHitsZero() {
		underTest.addPet(new OrgCat("Steve", "Description", 0, 200, 200, 200, 0));
		underTest.tickAllPets();
		assertTrue(underTest.getAllPets().isEmpty());
	}

	@Test
	public void shouldAffectHealthIfLitterBoxIsTooHigh() {
		underTest.addPet(new OrgCat("Steve","Description", 100,60,60,60,60));
		underTest.tickAllPets();
		int check = underTest.getPet("Steve").getHealth();
		assertThat(check, is(88));
	}
	@Test
	public void shouldWalkAllWalkables() {
		OrgDog orgDog = new OrgDog("name", "Description");
		RoboDog roboDog = new RoboDog("Steve", "description");
		underTest.addPet(orgDog);
		underTest.addPet(new OrgDog("Bob", "Description"));
		underTest.addPet(roboDog);
		int orgBeforeCheck = orgDog.waste;
		int roboBeforeCheck = roboDog.oils;
		underTest.walkAllWalkables();
		for (VirtualPet virtualPet : underTest.getAllPets()) {
			int check;
				if (virtualPet instanceof OrgDog) {
					check = orgDog.getWaste();
					assertThat(check, is(orgBeforeCheck-10));
				}
				if (virtualPet instanceof RoboDog) {
					check = roboDog.getOil();
					assertThat(check, is(roboBeforeCheck-1));
				}
			}
		}

}
