package week1.DesignPatternAndPrinciples.DependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulate a database fetch
        return "Customer{id=" + id + ", name='Tinu'}";
    }
}