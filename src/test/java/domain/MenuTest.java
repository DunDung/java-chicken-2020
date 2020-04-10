package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuTest {
	Menu menu;

	@BeforeEach
	void setUp() {
		menu = MenuRepository.fromWithNumber(1);
	}

	@Test
	void isMatchNumberTest() {
		assertThat(menu.isMatchNumber(1)).isTrue();
	}

	@Test
	void calculatePriceTest() {
		int totalPrice = menu.calculatePrice(new Quantity(10));

		assertThat(totalPrice).isEqualTo(160_000);
	}

	@Test
	void isChickenTest() {
		Menu notChicken = MenuRepository.fromWithNumber(22);

		assertThat(notChicken.isChicken()).isFalse();
		assertThat(menu.isChicken()).isTrue();
	}
}
