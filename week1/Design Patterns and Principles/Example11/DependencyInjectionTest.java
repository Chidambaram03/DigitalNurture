public class DependencyInjectionTest {

    public static void main(String[] args) {

        // Inject dependency through constructor
        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService customerService =
                new CustomerService(repository);

        System.out.println(
                "Customer ID 101: "
                + customerService.getCustomerById(101));

        System.out.println(
                "Customer ID 102: "
                + customerService.getCustomerById(102));

        System.out.println(
                "Customer ID 103: "
                + customerService.getCustomerById(103));
    }
}