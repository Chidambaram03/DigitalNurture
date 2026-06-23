public class BookSearchOperations {

    // Linear Search
    public static BookRecord linearSearch(
            BookRecord[] books,
            String title) {

        for (BookRecord book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    // Binary Search
    public static BookRecord binarySearch(
            BookRecord[] books,
            String title) {

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison =
                    books[mid].getTitle()
                            .compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}