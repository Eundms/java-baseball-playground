package _02_baseballgame;

public enum GameCommand {
	GAME_CONTINUE("1"),
	GAME_EXIT("2");
	private final String value;
	GameCommand(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static GameCommand convert(String command) {
		for(GameCommand gc : GameCommand.values()) {
			if(command.equals(gc.getValue())) {
				return gc;
			}
		}
		return null;
	}

}
