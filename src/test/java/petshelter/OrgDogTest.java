package petshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrgDogTest {

	Organic underTest = new OrgDog("Name", "Description");

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
	public void shouldReturnHealth() {
		int check = underTest.getHealth();
		assertThat(check, is(100));
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
	public void shouldGetWaste() {
		int check = underTest.getWaste();
		assertThat(check, is(20));
	}
	@Test
	public void shouldGetCageWaste () {
		OrgDog underTest = new OrgDog("name","description");
		int check = underTest.getCageWaste();
		assertThat(check, is(0));
	}

	@Test
	public void walkShouldReducePoop() {
		OrgDog underTest = new OrgDog("Name", "Description");
		int checkBefore = underTest.getWaste();
		underTest.walk();
		int checkAfter = underTest.getWaste();
		assertThat(checkAfter, is(checkBefore - 10));
	}

	@Test
	public void shouldFeedPet() {
		underTest.feed();
		int check = underTest.getHunger();
		assertThat(check, is(0));
	}

	@Test
	public void shouldWaterPet() {
		underTest.water();
		int check = underTest.getThirst();
		assertThat(check, is(0));
	}

	@Test
	public void shouldPlayWithPet() {
		underTest.play();
		int check = underTest.getBoredom();
		assertThat(check, is(0));
	}
	@Test
	public void shouldCleanCage() {
		OrgDog underTest = new OrgDog ("name","description");
		underTest.cleanCage();
		int check = underTest.getCageWaste();
		assertThat(check, is(0));
	}

	@Test
	public void shouldTickPet() {
		OrgDog underTest = new OrgDog("Name","Description");
		int beforeCheck = underTest.getHunger();
		underTest.tick();
		int check = underTest.getHunger();
		assertThat(check, is(beforeCheck + 2));
	}
	@Test
	public void shouldReduceHealthBecauseHungerIsTooHigh () {
		OrgDog underTest = new OrgDog("Name", "Description", 100, 110, 20, 20, 20,0);
		int beforeCheck = underTest.getHealth();
		underTest.tick();
		int afterCheck = underTest.getHealth();
		assertThat(afterCheck, is(beforeCheck-12));
	}
	
	

}
