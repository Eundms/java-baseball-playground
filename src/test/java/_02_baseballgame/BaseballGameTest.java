package _02_baseballgame;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaseballGameTest {
	void testPlay() throws Exception {
		BaseballGame baseballGame = new BaseballGame(new RandomInitializer(), new InputHandler(new BufferedReader(new InputStreamReader(System.in))), new GameJudge());
		baseballGame.play();
	}
}