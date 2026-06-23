public class TaskManagementSystem {

    public static void main(String[] args) {

        TaskLinkedList taskList =
                new TaskLinkedList();

        taskList.addTask(101,
                "Design Database",
                "Pending");

        taskList.addTask(102,
                "Develop API",
                "In Progress");

        taskList.addTask(103,
                "Testing",
                "Pending");

        taskList.traverseTasks();

        System.out.println("\nSearch Result:");

        TaskNode task =
                taskList.searchTask(102);

        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task Not Found");
        }

        taskList.deleteTask(102);

        taskList.traverseTasks();
    }
}