package _01_calculator;

public enum Operator {
	MULTIPLY("*") {
		@Override
		public int apply(int a, int b) {
			return a * b;
		}
	},
	ADD("+") {
		@Override
		public int apply(int a, int b) {
			return a + b;
		}
	},
	MINUS("-") {
		@Override
		public int apply(int a, int b) {
			return a - b;
		}
	},
	DIVIDE("/") {
		@Override
		public int apply(int a, int b) {
			if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
			return a / b;
		}
	};

	private final String value;

	Operator(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public abstract int apply(int a, int b);

	public static Operator fromValue(String value) {
		for (Operator operator : Operator.values()) {
			if (operator.getValue().equals(value)) {
				return operator;
			}
		}
		throw new IllegalArgumentException("Invalid operator: " + value);
	}

	public static boolean contains(String value) {
		for (Operator operator: Operator.values()) {
			if (operator.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}
}
