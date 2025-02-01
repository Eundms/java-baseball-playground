package _02_baseballgame;

public enum InputType {
	GAME_COMMAND("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 :" , "(게임 시작 : 1, 종료 : 2)"),
	NUMBER_GUESS( "숫자를 입력해 주세요 :", "(1-9까지의 서로 다른 3자리 수)");

	private final String guide;
	private final String hint;

	InputType(String guide, String hint) {
		this.guide = guide;
		this.hint = hint;
	}

	public String getGuide() {
		return this.guide;
	}

	public String getHint() {
		return this.hint;
	}
}