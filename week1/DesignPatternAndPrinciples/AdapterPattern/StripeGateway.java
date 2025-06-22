package week1.DesignPatternAndPrinciples.AdapterPattern;

public class StripeGateway {
    public void stripePayment(double amountInRupees) {
        System.out.println("Processing Stripe payment of $" + amountInRupees);
    }
}
