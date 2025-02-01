package _02_baseballgame;

/**
 * 게임 진행의 전반을 담당하는 역할
 * */
public class BaseballGame {
	private final RandomInitializer randomInitializer;
	private final InputHandler inputHandler;
	private final GameJudge gameJudge;

	public BaseballGame(RandomInitializer randomInitializer, InputHandler inputHandler, GameJudge gameJudge) {
		this.randomInitializer = randomInitializer;
		this.inputHandler = inputHandler;
		this.gameJudge = gameJudge;
	}

	public void play() throws Exception {
		while(true) {
			guess();
			String input = inputHandler.getGameCommand();
			if(GameCommand.convert(input) == GameCommand.GAME_EXIT) {
				break;
			}
			randomInitializer.initAnswer();
		}
	}

	private void guess() throws Exception {
		while(true) {
			String input = inputHandler.getUserGuess();
			Result result = gameJudge.judge(randomInitializer.getAnswer(), input);
			System.out.println(result.asString());
			if(result.isThreeStrike()) {
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				return;
			}
		}
	}
}
