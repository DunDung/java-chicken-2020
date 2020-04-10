package domain;

import java.util.Map;

public class Calculation {
	private static final int DISCOUNT_AMOUNT = 10_000;
	private final Map<Menu, Quantity> orders;

	public Calculation(Map<Menu, Quantity> orders) {
		this.orders = orders;
	}

	public int calculate() {
		return sumPrice() - calculateDiscount();

	}

	private int sumPrice() {
		int totalPrice = 0;
		for (Map.Entry<Menu, Quantity> entries : orders.entrySet()) {
			Menu menu = entries.getKey();
			Quantity quantity = entries.getValue();
			totalPrice += menu.calculatePrice(quantity);
		}
		return totalPrice;
	}

	private int calculateDiscount() {
		return orders.entrySet()
			.stream()
			.filter(entry -> entry.getKey().isChicken())
			.mapToInt(entry -> entry.getValue().divideDiscountedCount())
			.filter(discountedCount -> discountedCount > 0)
			.sum() * DISCOUNT_AMOUNT;
	}
}
