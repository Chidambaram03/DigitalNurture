public class ECommerceSearchTest {

    public static void main(String[] args) {

        SearchProduct[] products = {
                new SearchProduct(101, "Laptop", "Electronics"),
                new SearchProduct(102, "Mouse", "Accessories"),
                new SearchProduct(103, "Keyboard", "Accessories"),
                new SearchProduct(104, "Monitor", "Electronics"),
                new SearchProduct(105, "Printer", "Office")
        };

        int searchId = 104;

        System.out.println("Linear Search Result:");

        SearchProduct result1 =
                SearchAlgorithms.linearSearch(products, searchId);

        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println("\nBinary Search Result:");

        SearchProduct result2 =
                SearchAlgorithms.binarySearch(products, searchId);

        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product Not Found");
        }
    }
}