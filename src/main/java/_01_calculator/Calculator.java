package _01_calculator;

public class Calculator {
	public int calculate(String expression) {
		String[] tokens = parsor(expression);
		int result = Integer.parseInt(tokens[0]);

		for (int i = 1; i < tokens.length; i += 2) {
			String operatorSymbol = tokens[i];
			int value = Integer.parseInt(tokens[i + 1]);

			Operator operator = Operator.fromValue(operatorSymbol);
			result = operator.apply(result, value);
		}

		return result;
	}

	private String[] parsor(String expression) {
		return expression.split(" ");
	}
}
