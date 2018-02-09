package petshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.mockito.Matchers;

public class VirtualPetTest {
	@Test
	public void shouldInstantiateAPetWithNameAndDescription() {
		VirtualPet underTest = new VirtualPet("", "");

		assertNotNull(underTest);
	}

	@Test
	public void shouldInstantiateAPetWithNameDescriptionAndDefaultVitals() {
		VirtualPet underTest = new VirtualPet("", "");
		VirtualPet expected = new VirtualPet("", "", 20, 20, 20);

		// assertEquals(expected, underTest);
		assertThat(underTest.getHunger(), is(expected.getHunger()));
	}

	@Test
	public void shouldReturnANameAsSteve() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		String check = underTest.getName();

		assertEquals("Steve", check);
	}

	@Test
	public void shouldReturnHungerAsTen() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		int check = underTest.getHunger();

		assertEquals(20, check);
	}

	@Test
	public void shouldReturnSleepAsTen() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		int check = underTest.getThirst();

		assertEquals(20, check);
	}

	@Test
	public void shouldReturnBoredomAsTen() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		int check = underTest.getBoredom();

		assertEquals(20, check);
	}

	@Test
	public void shouldReturnDescriptionAsDescription() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		String check = underTest.getDescription();

		assertEquals("Description", check);
	}

	@Test
	public void TickShouldAddToAllVitalsTestingHunger() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		underTest.tick();
		int check = underTest.getHunger();

		assertEquals(22, check);
	}

	@Test
	public void ShouldSubtractFromHunger() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		underTest.feed();
		int check = underTest.getHunger();

		assertEquals(15, check);
	}

	@Test
	public void ShouldSubtractFromThirst() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		underTest.water();
		int check = underTest.getThirst();

		assertEquals(15, check);
	}

	@Test
	public void ShouldSubtractFromBoredom() {
		VirtualPet underTest = new VirtualPet("Steve", "Description");
		underTest.play();
		int check = underTest.getBoredom();

		assertEquals(10, check);
	}

}
