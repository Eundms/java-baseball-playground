package _02_baseballgame;

import java.util.HashSet;
import java.util.Set;

/**
 * 게임 결과 도출하는 역할
 * */
public class GameJudge {

	public Result judge(String answer, String userInput) {
		int strike = 0;
		Set<Character> used = new HashSet<>();
		for(int i = 0; i < 3; i++) {
			if(answer.charAt(i) == userInput.charAt(i)){
				strike += 1;
			}
			used.add(answer.charAt(i));
		}
		int ball = 0;
		for(int i = 0; i < 3; i++) {
			if(used.contains(userInput.charAt(i)) && answer.charAt(i) != userInput.charAt(i)) {
				ball += 1;
			}
		}
		return new Result(ball, strike);
	}
}
