package petshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrgDogTest {
	
	Organic underTest = new OrgDog("Name","Description",20,20,20,20);
		
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
	

	
}
