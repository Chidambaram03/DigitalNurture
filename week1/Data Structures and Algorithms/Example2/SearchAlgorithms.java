public class SearchAlgorithms {

    // Linear Search
    public static SearchProduct linearSearch(SearchProduct[] products,
                                             int productId) {

        for (SearchProduct product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static SearchProduct binarySearch(SearchProduct[] products,
                                             int productId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == productId) {
                return products[mid];
            }

            if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}