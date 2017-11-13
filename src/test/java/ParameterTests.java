import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class ParameterTests {

	@ParameterizedTest
	@CsvSource({ "String1", "String2", "String13" })
	void testWithCsvSource(String arg) {
		assertThat(arg, containsString("1"));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/resources/testData.csv")
	void testWithCsvFile(String arg1, String arg2) {
		
	}

}
