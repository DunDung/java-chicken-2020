package domain;

import java.util.Arrays;
import java.util.List;

public class Command {
	private static final List<Integer> allowedCommands = Arrays.asList(1, 2, 3);
	private static final String NOT_MATCH_MENU_MESSAGE = "없는 기능입니다.";
	private static final int EXIT_NO = 3;
	private static final int EXIT_STATUS = 1;
	private static final int ORDER_NO = 1;

	private final int command;

	public Command(int command) {
		if (!allowedCommands.contains(command)) {
			throw new IllegalArgumentException(NOT_MATCH_MENU_MESSAGE);
		}
		if (command == EXIT_NO) {
			System.exit(EXIT_STATUS);
		}
		this.command = command;
	}

	public boolean isOrder() {
		return command == ORDER_NO;
	}

}
