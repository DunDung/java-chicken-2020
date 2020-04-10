package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.Test;

public class MenuTest {

	@Test
	void isMatchNumberTest() {
		Menu menu = MenuRepository.fromWithNumber(1);

		assertThat(menu.isMatchNumber(1)).isTrue();
	}
}
