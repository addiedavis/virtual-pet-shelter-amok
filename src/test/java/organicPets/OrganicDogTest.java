package organicPets;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("Toby", 10, 5, 15, 20);
	
	@Test
	public void shouldHaveName() {
		String findName = underTest.getName();
		assertThat(findName, is("Toby"));
	}
	
	@Test
	public void shouldHaveHungerLevel() {
		int foundHungerLevel = underTest.getHungerLevel();
		assertThat(foundHungerLevel, is(10));
	}
	
	@Test
	public void shouldHaveThirstLevel() {
		int foundThirstLevel = underTest.getThirstLevel();
		assertThat(foundThirstLevel, is(5));
	}
	
	@Test
	public void shouldHaveHappyLevel() {
		int foundHappyLevel = underTest.getHappyLevel();
		assertThat(foundHappyLevel, is(15));
	}
	
	@Test
	public void shouldHaveHealthLevel() {
		int foundHealthLevel = underTest.getHealthLevel();
		assertThat(foundHealthLevel, is(20));
	}
	
	@Test
	public void shouldIncreaseHappyBy5AfterWalking() {
		underTest.walkDog();
		int foundHappyLevel = underTest.getHappyLevel();
		assertThat(foundHappyLevel, is(20));
	}
	
}
