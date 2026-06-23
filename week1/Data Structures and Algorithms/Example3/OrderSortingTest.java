public class OrderSortingTest {

    public static void main(String[] args) {

        CustomerOrder[] orders = {
                new CustomerOrder(101, "Alice", 2500),
                new CustomerOrder(102, "Bob", 7000),
                new CustomerOrder(103, "Charlie", 1500),
                new CustomerOrder(104, "David", 5000)
        };

        System.out.println("Original Orders:");
        OrderSorter.displayOrders(orders);

        // Bubble Sort
        OrderSorter.bubbleSort(orders);

        System.out.println("\nOrders After Bubble Sort:");
        OrderSorter.displayOrders(orders);

        CustomerOrder[] quickSortOrders = {
                new CustomerOrder(101, "Alice", 2500),
                new CustomerOrder(102, "Bob", 7000),
                new CustomerOrder(103, "Charlie", 1500),
                new CustomerOrder(104, "David", 5000)
        };

        OrderSorter.quickSort(
                quickSortOrders,
                0,
                quickSortOrders.length - 1);

        System.out.println("\nOrders After Quick Sort:");
        OrderSorter.displayOrders(quickSortOrders);
    }
}