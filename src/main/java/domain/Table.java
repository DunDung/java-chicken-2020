package domain;

import java.util.Objects;

public class Table {
	private final int number;
	private final Orders orders;

	public Table(final int number) {
		this.number = number;
		this.orders = new Orders();
	}

	public boolean isMatch(int number) {
		return this.number == number;
	}

	public void order(Menu menu, int quantity) {
		orders.order(menu, quantity);
	}

	public boolean isOrdered() {
		return orders.isOrdered();
	}

	@Override
	public String toString() {
		return Integer.toString(number);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Table table = (Table)o;
		return number == table.number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
}
