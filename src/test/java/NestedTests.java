import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.Writer;

class NestedTests {
	private Writer writer;

	@BeforeEach
	void Setup() {
		writer = new Writer();
	}

	@ParameterizedTest
	@DisplayName("Try out a parameterized test")
	@ValueSource(strings = { "String1", "String1", "String13" })
	void testWithStringParameter(String argument) {
		assertThat(argument, containsString("1"));
	}

	@Test
	@DisplayName("un-nested test")
	void ShouldWriteBlahTest() {
		String result = writer.WriteGreenLantern();
		assertThat(result, IsEqual.equalTo("green lantern"));
	}

	@Nested
	@DisplayName("a super-hero writer")
	class SuperHeroWriterTests {

		@Test
		@DisplayName("should write 'green lantern'")
		void ShouldWriteBlahTest() {
			String result = writer.WriteGreenLantern();
			assertThat(result, IsEqual.equalTo("green lantern"));
		}

		@Test
		@DisplayName("should not write sinestro")
		void ShouldNotWriteKablewieTest() {
			String result = writer.WriteGreenLantern();
			assertThat(result, not(IsEqual.equalTo("sinestro")));
		}
	}

	@Nested
	@DisplayName("a math writer")
	class MathWriterTests {

		@Test
		@DisplayName("should write a message adding two numbers together")
		void ShouldAddTwoNumbers() {
			int numberToAdd = 6;
			int anotherNumberToAdd = 5;
			int expectedResult = 11;
			String result = writer.WriteNumberPlusNumber(numberToAdd, anotherNumberToAdd);
			assertThat(result, IsEqual.equalTo(numberToAdd + " + " + anotherNumberToAdd + " equals " + expectedResult));
		}

		@Test
		@DisplayName("should write a message subtracting the 2nd number from the 1st")
		void ShouldSubtractTwoNumbers() {
			int firstNumber = 6;
			int numberToSubtract = 5;
			int expectedResult = 1;
			String result = writer.WriteSubtractNumber(firstNumber, numberToSubtract);
			assertThat(result,
					IsEqual.equalTo(firstNumber + " - " + numberToSubtract + " is gelijk aan " + expectedResult));
		}

		@Test
		@DisplayName("should not write messages in French")
		void ShouldNotWriteInFrench() {
			int numberToAdd = 6;
			int anotherNumberToAdd = 5;
			String result = writer.WriteNumberPlusNumber(numberToAdd, anotherNumberToAdd);
			assertThat(result, not(containsString("équivaut à")));
		}
	}
}