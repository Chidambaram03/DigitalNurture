public class LibraryManagementTest {

    public static void main(String[] args) {

        // Sorted by title for Binary Search
        BookRecord[] books = {

                new BookRecord(
                        101,
                        "Data Structures",
                        "Mark Allen"),

                new BookRecord(
                        102,
                        "Java Programming",
                        "James Gosling"),

                new BookRecord(
                        103,
                        "Operating Systems",
                        "Abraham Silberschatz"),

                new BookRecord(
                        104,
                        "Python Basics",
                        "Guido van Rossum"),

                new BookRecord(
                        105,
                        "Software Engineering",
                        "Roger Pressman")
        };

        String searchTitle = "Python Basics";

        System.out.println("Linear Search Result:");

        BookRecord result1 =
                BookSearchOperations.linearSearch(
                        books,
                        searchTitle);

        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Book Not Found");
        }

        System.out.println("\nBinary Search Result:");

        BookRecord result2 =
                BookSearchOperations.binarySearch(
                        books,
                        searchTitle);

        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Book Not Found");
        }
    }
}