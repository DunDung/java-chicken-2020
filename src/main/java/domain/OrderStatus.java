package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderStatus {
	private final Map<Table, List<Menu>> orderStatus;

	public OrderStatus() {
		this.orderStatus = new HashMap<>();
	}
}
