package _02_baseballgame;


public class Result {
	private int ball;
	private int strike;

	Result(int ball, int strike) {
		this.ball = ball;
		this.strike = strike;
	}

	public String asString() {
		StringBuilder sb = new StringBuilder();
		if(this.ball == 0 && this.strike == 0) {
			return "낫싱";
		}

 		if(this.ball > 0) {
			sb.append(this.ball).append("볼");
		}

		if(this.strike > 0) {
			if(sb.length() > 0) {
				sb.append(" ");
			}
			sb.append(this.strike).append("스트라이크");
		}

		return sb.toString();
	}
	public boolean isThreeStrike() {
		return this.strike == 3;
	}

	public int getBall() {
		return this.ball;
	}

	public int getStrike() {
		return this.strike;
	}

}