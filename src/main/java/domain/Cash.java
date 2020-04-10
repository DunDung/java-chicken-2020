package domain;

public class Cash implements Payment {
	private static final double DISCOUNT_RATE = 0.05;

	@Override
	public int calculate(int totalAmount) {
		return (int)(totalAmount - (totalAmount * DISCOUNT_RATE));
	}
}
