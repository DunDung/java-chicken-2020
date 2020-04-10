package domain;

public class CreditCard implements Payment {

	@Override
	public int calculate(int totalAmount) {
		return totalAmount;
	}
}
