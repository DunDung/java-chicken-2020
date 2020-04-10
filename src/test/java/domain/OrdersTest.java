package domain;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrdersTest {

	@DisplayName("주문을 했을 경우")
	@Test
	void isOrderedTest() {
		Orders orders = new Orders();
		orders.order(MenuRepository.fromWithNumber(1), 10);

		assertThat(orders.isOrdered()).isTrue();
	}

	@DisplayName("주문을 안했을 경우")
	@Test
	void isOrderedTest2() {
		Orders orders = new Orders();

		assertThat(orders.isOrdered()).isFalse();
	}
}
