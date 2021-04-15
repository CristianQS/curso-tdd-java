import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void length_is_100 () {
		var result = FizzBuzz.ConvertToFizzBuzz();

		assertThat(result.size(), Matchers.is(100));
	}

	@Test
	public void multiple_of_three_is_Fizz() {

		var result = FizzBuzz.ConvertToFizzBuzz();

		assertEquals("Fizz", result.get(2));
	}
}
