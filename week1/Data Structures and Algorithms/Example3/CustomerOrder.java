public class CustomerOrder {

    private int orderId;
    private String customerName;
    private double totalPrice;

    public CustomerOrder(int orderId,
                         String customerName,
                         double totalPrice) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
                ", Customer: " + customerName +
                ", Total Price: ₹" + totalPrice;
    }
}