package week1.DesignPatternAndPrinciples.DependencyInjection;

public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Manual Dependency Injection
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.printCustomerDetails(100);
    }
}
