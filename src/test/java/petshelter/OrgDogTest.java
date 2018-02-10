package petshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrgDogTest {

	Organic underTest = new OrgDog("Name", "Description", 20, 20, 20, 20, 20);

	@Test
	public void shouldReturnName() {
		String check = underTest.getName();
		assertThat(check, is("Name"));
	}

	@Test
	public void shouldReturnDescription() {
		String check = underTest.getDescription();
		assertThat(check, is("Description"));
	}

	@Test
	public void shouldReturnhealth() {
		int check = underTest.getHealth();
		assertThat(check, is(20));
	}

	@Test
	public void shouldReturnHunger() {
		int check = underTest.getHunger();
		assertThat(check, is(20));
	}

	@Test
	public void shouldReturnThirst() {
		int check = underTest.getThirst();
		assertThat(check, is(20));
	}

	@Test
	public void shouldReturnBoredom() {
		int check = underTest.getBoredom();
		assertThat(check, is(20));
	}

	@Test
	public void shouldGetWaster() {
		Organic underTest = new OrgDog("Name", "Description", 20, 20, 20, 20, 20);
		int check = underTest.getWaste();
		assertThat(check, is(20));
	}

	@Test
	public void walkShouldReducePoop() {
		OrgDog underTest = new OrgDog("Name", "Description", 20, 20, 20, 20, 20);
		int checkBefore = underTest.getWaste();
		underTest.walk();
		int checkAfter = underTest.getWaste();
		assertThat(checkAfter, is(checkBefore - 2));
	}

	@Test
	public void shouldFeedPet() {
		Organic underTest = new OrgDog("Name", "Description", 20, 20, 20, 20, 20);
		underTest.feed();
		int check = underTest.getHunger();
		assertThat(check, is(0));
	}
	@Test
	public void shouldWaterPet() {
		Organic underTest = new OrgDog("Name", "Description", 20, 20, 20, 20, 20);
		underTest.water();
		int check = underTest.getThirst();
		assertThat(check, is(0));
	}
	@Test
	public void shouldPlayWithPet() {
		Organic underTest = new OrgDog("Name", "Description", 20, 20, 20, 20, 20);
		underTest.play();
		int check = underTest.getBoredom();
		assertThat(check, is(0));
	}
	@Test
	public void shouldTickPet() {
	Organic underTest = new OrgDog("Name", "Description", 20, 20, 20, 20, 20);
	int beforeCheck = underTest.getHunger();
	underTest.tick();
	int check = underTest.getHunger();
	assertThat(check, is(beforeCheck+2));
	}
	



	
	
	
	
	
	
	
}
