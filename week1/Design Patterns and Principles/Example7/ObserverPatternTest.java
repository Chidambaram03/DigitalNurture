public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");

        // Register observers
        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        // Update stock price
        stockMarket.setStock("CTS", 3850.50);

        // Remove one observer
        stockMarket.deregisterObserver(webUser);

        // Update stock price again
        stockMarket.setStock("Infosys", 1625.75);
    }
}