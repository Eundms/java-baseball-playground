package _02_baseballgame;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class RandomInitializeTest {

	@Test
	public void init() {
		RandomInitializer randomInitializer = new RandomInitializer();

		int count = 100;
		while (count-- > 0) {
			assertThat(validate(randomInitializer.getAnswer())).isTrue();
			randomInitializer.initAnswer();
		}
	}

	private boolean validate(String answer) {
		if(answer.length() !=3)return false;

		Set<Character> set = new HashSet<>();
		for(int i = 0; i < 3; i++) {
			char item = answer.charAt(i);
			if(!(item >= '1' && item <= '9')){
				return false;
			}
			set.add(item);
		}
		return set.size() == 3;
	}
}
