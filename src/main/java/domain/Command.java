package domain;

import java.util.Arrays;
import java.util.List;

public class Command {
	private static final List<Integer> allowedCommands = Arrays.asList(1, 2, 3);
	private static final String NOT_MATCH_MENU_MESSAGE = "없는 기능입니다.";

	private final int command;

	public Command(int command) {
		if (!allowedCommands.contains(command)) {
			throw new IllegalArgumentException(NOT_MATCH_MENU_MESSAGE);
		}
		this.command = command;
	}

	public boolean isOrder() {
		return command == 1;
	}

}
