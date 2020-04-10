package domain;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuRepositoryTest {

	@DisplayName("메뉴에 있는 번호인 경우")
	@Test
	void fromTest() {
		Menu expectedMenu = new Menu(1, "후라이드", Category.CHICKEN, 16_000);

		assertThat(MenuRepository.from(1)).isEqualTo(expectedMenu);
	}

	@DisplayName("메뉴에 없는 번호인 경우")
	@Test
	void fromTest2() {
		assertThatThrownBy(() -> MenuRepository.from(7))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
