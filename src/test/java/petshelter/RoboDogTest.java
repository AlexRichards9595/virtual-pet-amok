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

	
	

//	@Test
//	public void shouldGetPoop() {
//		OrgDog underTest = new OrgDog("Name", "Description", 20, 20, 20, 20, 20);
//		int check = underTest.getPoop();
//		assertThat(check, is(20));
//	}

//	@Test
//	public void walkShouldReducePoop() {
//		int checkBefore = underTest.getHealth();
//		underTest.walk();
//		int checkAfter = underTest.getHealth();
//		assertThat(checkAfter, is(checkBefore - 2));
//	}

}
