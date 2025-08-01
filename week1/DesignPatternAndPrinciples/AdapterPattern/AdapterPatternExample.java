package week1.DesignPatternAndPrinciples.AdapterPattern;

public class AdapterPatternExample {
    public static void main(String[] args) {
        // PayPal payment
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        payPalProcessor.processPayment(2500.00);

        // Stripe payment
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(4200.50);
    }
}
