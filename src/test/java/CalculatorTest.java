import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _01_calculator.Calculator;

public class CalculatorTest {
	@Test
	void calculate() {
		String actual = "2 + 3 * 4 / 2";
		Calculator calculator = new Calculator();
		int result = calculator.calculate(actual);
		assertThat(result).isEqualTo(10);
	}
}
