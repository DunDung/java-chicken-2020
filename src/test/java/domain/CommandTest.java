package domain;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommandTest {

	@DisplayName("없는 기능인 경우")
	@Test
	void createTest() {
		assertThatThrownBy(() -> new Command(4)).isInstanceOf(IllegalArgumentException.class);
	}
}
