import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class ParameterTest {

	@DisplayName("get test parameters from string array")
	@ParameterizedTest
	@CsvSource({ "String1", "String2", "String13" })
	void testWithCsvSource(String arg) {
		assertThat(arg, containsString("1"));
	}
	
	@DisplayName("get test parameters from getStrings() method")
	@ParameterizedTest
	@MethodSource("getStreamOfStrings")
	void testWithStream(String arg) {
		assertThat(arg, containsString("1"));
	}
	
	@DisplayName("get test parameters from CSV file")
	@ParameterizedTest
	@CsvFileSource(resources = "/testData.csv")
	void testWithCsvFile(String arg1, String arg2) {
		assertThat(arg1, containsString("H"));
		assertThat(arg2, containsString("H"));
	}
	
	static Stream<String> getStreamOfStrings() {
		return Stream.of("String1", "String2", "String13");
	}
}
