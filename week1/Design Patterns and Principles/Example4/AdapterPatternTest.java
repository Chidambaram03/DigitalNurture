public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor payPalProcessor =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());

        payPalProcessor.processPayment(5000.00);
        stripeProcessor.processPayment(7500.00);
    }
}