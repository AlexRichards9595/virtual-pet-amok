package petshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrgDogTest {
	
	Organic underTest = new OrgDog("Name","Description",20,20,20,20,20);
		
	@Test
	public void shouldReturnName () {
		String check = underTest.getName();
		assertThat(check, is("Name"));
	}
	@Test
	public void shouldReturnDescription () {
		String check = underTest.getDescription();
		assertThat(check, is("Description"));
	}
	@Test
	public void shouldReturnhealth () {
		int check = underTest.getHealth();
		assertThat(check, is(20));
	}
	@Test
	public void shouldReturnHunger () {
		int check = underTest.getHunger();
		assertThat(check, is(20));
	}
	@Test
	public void shouldReturnThirst () {
		int check = underTest.getThirst();
		assertThat(check, is(20));
	}
	@Test
	public void shouldReturnBoredom () {
		int check = underTest.getBoredom();
		assertThat(check, is(20));
	}
	@Test 
	public void shouldGetPoop() {
		OrgDog underTest = new OrgDog("Name","Description",20,20,20,20,20);
		int check = underTest.getPoop();
		assertThat(check, is(20));
	}
	@Test
	public void walkShouldReducePoop() {
		OrgDog underTest = new OrgDog("Name","Description",20,20,20,20,20);
		int checkBefore = underTest.getPoop();
		underTest.walk();
		int checkAfter = underTest.getPoop();
		assertThat(checkAfter, is(checkBefore-2));
	}
	

	
}
