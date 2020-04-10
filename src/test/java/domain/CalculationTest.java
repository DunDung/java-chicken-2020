package domain;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationTest {
	Orders orders;

	@BeforeEach
	void setUp() {
		orders = new Orders();
		orders.order(MenuRepository.fromWithNumber(1), 10);
		orders.order(MenuRepository.fromWithNumber(2), 10);
		orders.order(MenuRepository.fromWithNumber(3), 10);
	}

	@Test
	void calculateTest() {
		Calculation calculation = orders.createCalculation();

		assertThat(calculation.calculate()).isEqualTo(450_000);
	}
}
