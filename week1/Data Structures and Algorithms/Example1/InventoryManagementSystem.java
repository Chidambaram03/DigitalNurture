public class InventoryManagementSystem {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101,
                                 "Laptop",
                                 10,
                                 55000);

        Product p2 = new Product(102,
                                 "Mouse",
                                 50,
                                 500);

        // Add Products
        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayProducts();

        // Update Product
        manager.updateProduct(101,
                              "Gaming Laptop",
                              8,
                              65000);

        manager.displayProducts();

        // Delete Product
        manager.deleteProduct(102);

        manager.displayProducts();
    }
}