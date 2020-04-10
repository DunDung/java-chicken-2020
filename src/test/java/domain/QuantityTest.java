package domain;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QuantityTest {

	@DisplayName("0이하로 생성하는 경우")
	@Test
	void createTest() {
		assertThatThrownBy(() -> new Quantity(0)).isInstanceOf(IllegalArgumentException.class);
	}


	@DisplayName("100이상으로 생성하는 경우")
	@Test
	void createTest2() {
		assertThatThrownBy(() -> new Quantity(100)).isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("add 성공")
	@Test
	void addTest() {
		Quantity expectedQuantity = new Quantity(99);

		assertThat(new Quantity(1).add(98)).isEqualTo(expectedQuantity);
	}

	@DisplayName("100이 넘어서 add가 실패하는 경우")
	@Test
	void addrTest2() {
		assertThatThrownBy(() -> new Quantity(1).add(99)).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void calculatePriceTest() {
		assertThat(new Quantity(10).calculatePrice(1000)).isEqualTo(10000);
	}

	@Test
	void divideDiscountedCountTest() {
		assertThat(new Quantity(30).divideDiscountedCount()).isEqualTo(3);
		assertThat(new Quantity(1).divideDiscountedCount()).isEqualTo(0);
	}
}
