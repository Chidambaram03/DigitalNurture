public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        // Simulating customer lookup
        if (id == 101) {
            return "John Doe";
        } else if (id == 102) {
            return "Alice Smith";
        } else {
            return "Customer Not Found";
        }
    }
}