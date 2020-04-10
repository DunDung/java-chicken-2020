package domain;

import java.util.HashMap;
import java.util.Map;

public class Orders {
	private final Map<Menu, Quantity> orders;

	public Orders() {
		orders = new HashMap<>();
	}

	public void order(Menu menu, int quantity) {
		orders.computeIfPresent(menu, (Menu key, Quantity value) -> value = value.add(quantity));
		orders.putIfAbsent(menu, new Quantity(quantity));
	}

	public boolean isOrdered() {
		return !orders.isEmpty();
	}

	public Calculation createCalculation() {
		return new Calculation(orders);
	}

}
