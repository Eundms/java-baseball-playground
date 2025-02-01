package _02_baseballgame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 사용자
 * */
public class Player {
	public static void main(String[] args) throws Exception {
		BaseballGame baseballGame = new BaseballGame(new RandomInitializer(), new InputHandler(new BufferedReader(new InputStreamReader(System.in))), new GameJudge());
		baseballGame.play();
	}
}
