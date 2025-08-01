package week1.DesignPatternAndPrinciples.DependencyInjection;

public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void printCustomerDetails(int id) {
        String customer = customerRepository.findCustomerById(id);
        System.out.println("Customer Details: " + customer);
    }
}
