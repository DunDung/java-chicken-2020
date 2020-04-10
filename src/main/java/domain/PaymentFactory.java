package domain;

public class PaymentFactory {
	private static final String INCORRECT_PAYMENT_WAY_MESSAGE = "올바르지 않은 결제 방법입니다.";
	private static final int CREDIT_CARD_NO = 1;
	private static final int CASH_NO = 2;

	public static Payment create(int paymentWay) {
		validatePaymentWay(paymentWay);
		if (paymentWay == CREDIT_CARD_NO) {
			return new CreditCard();
		}
		return new Cash();
	}
	
	private static void validatePaymentWay(int paymentWay) {
		if (!(paymentWay == CREDIT_CARD_NO || paymentWay == CASH_NO)) {
			throw new IllegalArgumentException(INCORRECT_PAYMENT_WAY_MESSAGE);
		}
	}
}
