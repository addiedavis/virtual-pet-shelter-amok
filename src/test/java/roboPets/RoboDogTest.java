package roboPets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


import org.junit.Test;

public class RoboDogTest {
	
	RoboDog underTest = new RoboDog("Roger", 10, 5, 20);
	
	@Test
	public void shouldHaveNameOilHappyHealth() {
	String foundName = underTest.getName();
	int foundOilLevel = underTest.getOilLevel();
	int foundHappyLevel = underTest.getHappyLevel();
	int foundHealthLevel = underTest.getHealthLevel();
	assertThat(foundName, is("Roger"));
	assertThat(foundOilLevel, is(10));
	assertThat(foundHappyLevel, is(5));
	assertThat(foundHealthLevel, is(20));
	}
	
	@Test
	public void shouldIncreaseHappyBy5AfterWalking() {
		underTest.walkDog();
		int foundHappyLevel = underTest.getHappyLevel();
		assertThat(foundHappyLevel, is(10));
	}

}
