package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.Test;

public class TableTest {

	@Test
	void isMatchTest() {
		assertThat(new Table(3).isMatch(3)).isTrue();
	}
}
