package domain;

import java.util.Objects;

public class Quantity {
	private static final int MAX = 99;
	private static final String CANNOT_ORDER_QUANTITY_MESSAGE = "주문할 수 있는 수량이 아닙니다.";
	private static final int DISCOUNTED_COUNT = 10;

	private final int quantity;

	public Quantity(int quantity) {
		if (quantity < 1 || quantity > MAX) {
			throw new IllegalArgumentException(CANNOT_ORDER_QUANTITY_MESSAGE);
		}
		this.quantity = quantity;
	}

	public Quantity add(int quantity) {
		return new Quantity(this.quantity + quantity);
	}

	public int calculatePrice(int price) {
		return quantity * price;
	}

	public int divideDiscountedCount() {
		return quantity / DISCOUNTED_COUNT;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Quantity quantity1 = (Quantity)o;
		return quantity == quantity1.quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(quantity);
	}
}
