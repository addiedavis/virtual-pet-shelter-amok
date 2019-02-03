import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest;
	
	@Test
	public void shouldHaveName() {
		OrganicDog dog1 = new OrganicDog("Toby", 10, 5, 15);
		String findName = underTest.findPet("Toby");
		assertThat(findName, is("Toby"));
	}
	
	
}
