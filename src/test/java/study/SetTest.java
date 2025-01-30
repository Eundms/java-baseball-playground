package study;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
	private Set<Integer> numbers;
	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		assertThat(numbers.size()).isEqualTo(3);
	}

	@ParameterizedTest
	@ValueSource(strings = {"1", "2", "3"})
	void contains_ShouldExists(String input) {
		assertThat(numbers).contains(Integer.parseInt(input));
	}

	@ParameterizedTest
	@CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
	void contains_ShouldReturnExpectedValue(int input, boolean expected) {
		List<Integer> numbers = List.of(1, 2, 3);
		boolean actual = numbers.contains(input);
		assertThat(actual).isEqualTo(expected);
	}
}
