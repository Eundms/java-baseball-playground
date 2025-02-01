package _02_baseballgame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GameJudgeTest {

	@ParameterizedTest
	@CsvSource({"123, 123, 3, 0", "123, 321, 1, 2", "123, 231, 0, 3", "567, 123, 0, 0"})
	@DisplayName("올바른 숫자 야구 결과값을 반환하는지 테스트 ")
	void valid(String answer, String userInput, int strike, int ball) {
		GameJudge gameJudge = new GameJudge();
		Result result = gameJudge.judge(answer, userInput);
		assertThat(result.getBall()).isEqualTo(ball);
		assertThat(result.getStrike()).isEqualTo(strike);
	}
}
