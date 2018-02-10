package petshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboDogTest {

	Robotic underTest = new RoboDog("Name", "Description", 20, 20);

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
	public void shouldReturnOil() {
		int check = underTest.getOil();
		assertThat(check, is(20));
	}

	@Test
	public void shouldOilRoboPet() {
		int beforeCheck = underTest.getOil();
		underTest.oilPet();
		int afterCheck = underTest.getOil();
		assertThat(afterCheck, is(beforeCheck + 50));
	}

	@Test
	public void shouldTickRoboPet() {
		int beforeCheck = underTest.getOil();
		underTest.tick();
		int afterCheck = underTest.getOil();
		assertThat(afterCheck, is(beforeCheck - 2));

	}

}
