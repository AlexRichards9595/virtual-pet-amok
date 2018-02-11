package petshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrgCatTest {

	Organic underTest = new OrgCat("Name", "Description", 20, 20, 20, 20, 20);

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

}
