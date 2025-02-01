package _02_baseballgame;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

/**
 * 1-9중 서로 다른 수를 가진 세자리 수 만들어내는 역할
 * */
public class RandomInitializer {
	private String answer;

	RandomInitializer() {
		this.answer = initAnswer();
	}

	public String initAnswer() {
		SecureRandom secureRandom = new SecureRandom();
		Set<Integer> uniqueDigits = new HashSet<>();

		while (uniqueDigits.size() < 3) {
			int digit = secureRandom.nextInt(9) + 1; // 1부터 9 사이의 숫자 생성
			uniqueDigits.add(digit);
		}

		StringBuilder sb = new StringBuilder();
		for (int num : uniqueDigits) {
			sb.append(num);
		}

		return sb.toString();
	}

	public String getAnswer() {
		return this.answer;
	}
}
