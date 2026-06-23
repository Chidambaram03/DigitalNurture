public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student =
                new Student("John", "S101", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update Student Details
        controller.setStudentName("Alice");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}