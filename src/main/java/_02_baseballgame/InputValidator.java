package _02_baseballgame;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 유틸리티성 메서드로서 인스턴스를 생성할 필요 없이 클래스 이름으로 직접 호출
 */

public class InputValidator {
	static Map<InputType, Validator> validators;
	static {
		validators = new HashMap<>();
		validators.put(InputType.GAME_COMMAND, new Validator("^[12]$", 1));
		validators.put(InputType.NUMBER_GUESS, new Validator("^[0-9]*$", 3));
	}

	public static boolean isValid(InputType type, String input) {
		Validator validator = validators.get(type);
		return validator.validate(input);
	}

	static class Validator {
		private String regex;
		private int len;

		Validator(String regex, int len) {
			this.regex =  regex;
			this.len = len;
		}
		public boolean validate(String input) {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			return input.length() == len && matcher.matches();
		}
	}
}
