package _02_baseballgame;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.io.BufferedReader;
import java.io.IOException;

class InputHandlerTest {

	private InputHandler inputHandler;
	private BufferedReader mockReader;

	@BeforeEach
	void setUp() {
		mockReader = mock(BufferedReader.class);
		inputHandler = new InputHandler(mockReader);
	}

	@Test
	void testGetUserGuess_ValidInput() throws IOException {
		when(mockReader.readLine()).thenReturn("123");
		String userGuess = inputHandler.getUserGuess();
		assertEquals("123", userGuess);
	}

	@Test
	void testGetGameCommand_ValidInput() throws IOException {
		when(mockReader.readLine()).thenReturn(GameCommand.GAME_CONTINUE.getValue());

		String gameCommand = inputHandler.getGameCommand();

		assertEquals(GameCommand.GAME_CONTINUE.getValue(), gameCommand);
	}

	@Test
	void testGetUserGuess_InvalidInput() throws IOException {
		when(mockReader.readLine()).thenReturn("abc").thenReturn("123");
		String userGuess = inputHandler.getUserGuess();
		assertEquals("123", userGuess);
	}

	@Test
	void testGetGameCommand_InvalidInput() throws IOException {
		when(mockReader.readLine()).thenReturn("xyz").thenReturn(GameCommand.GAME_EXIT.getValue());

		String gameCommand = inputHandler.getGameCommand();

		assertEquals(GameCommand.GAME_EXIT.getValue(), gameCommand);
	}

}

