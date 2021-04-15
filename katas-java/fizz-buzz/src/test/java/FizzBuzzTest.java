import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void multiple_of_three_is_Fizz() {

		var result = FizzBuzz.ConvertToFizzBuzz();

		assertEquals("Fizz", result.get(2));
	}
}
