package _02_baseballgame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ResultTest {
	@ParameterizedTest
	@CsvSource({"123, 123, 3스트라이크", "123, 321, 2볼 1스트라이크", "123, 231, 3볼", "567, 123, 낫싱"})
	@DisplayName("올바른 숫자 야구 결과값(문자)을 반환하는지 테스트")
	void valid(String answer, String userInput, String message) {
		GameJudge gameJudge = new GameJudge();
		Result result = gameJudge.judge(answer, userInput);
		assertThat(result.asString()).isEqualTo(message);
	}
}
