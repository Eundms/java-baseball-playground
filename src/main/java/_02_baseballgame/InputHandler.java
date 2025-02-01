package _02_baseballgame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 사용자의 인풋은 관리하는 클래스
 * */
public class InputHandler {
	private final BufferedReader br ;

	InputHandler(BufferedReader br) {
		this.br = br;
	}

	public String getUserGuess() {
		return this.from(InputType.NUMBER_GUESS);
	}

	public String getGameCommand() {
		return this.from(InputType.GAME_COMMAND);
	}

	private String from(InputType type)  {
		try {
			String input = "";
			while(true) {
				System.out.println(type.getGuide());
				input = br.readLine();
				if(InputValidator.isValid(type, input)) {
					break;
				}
				System.out.println("다시 입력해주세요." + type.getHint());
			}
			return input;
		} catch (Exception e) {

		}
		return "";
	}

}
