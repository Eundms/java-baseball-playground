package _02_baseballgame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class InputHandlerValidateTest {

	@ParameterizedTest
	@CsvSource({
		"1, true",
		"2, true",
		"3, false",
		"12, false",
		"'', false"
	})
	@DisplayName("게임 시작/종료 입력 검증 테스트 (1 또는 2만 허용)")
	void testGameCommandValidation(String input, boolean expected) {
		assertThat(InputValidator.isValid(InputType.GAME_COMMAND, input)).isEqualTo(expected);
	}

	@ParameterizedTest
	@CsvSource({
		"123, true",
		"12, false",
		"1234, false",
		"abc, false",
		"12a, false",
		"'', false"
	})
	@DisplayName("숫자 추측 입력 검증 테스트 (세 자리 숫자만 허용)")
	void testNumberGuessValidation(String input, boolean expected) {
		assertThat(InputValidator.isValid(InputType.NUMBER_GUESS, input)).isEqualTo(expected);
	}
}
