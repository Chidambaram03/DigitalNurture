public class TaskLinkedList {

    private TaskNode head;

    // Add Task
    public void addTask(int taskId,
                        String taskName,
                        String status) {

        TaskNode newNode =
                new TaskNode(taskId, taskName, status);

        if (head == null) {
            head = newNode;
            return;
        }

        TaskNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Search Task
    public TaskNode searchTask(int taskId) {

        TaskNode current = head;

        while (current != null) {

            if (current.taskId == taskId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    // Traverse Tasks
    public void traverseTasks() {

        TaskNode current = head;

        System.out.println("\nTask List:");

        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {
            return;
        }

        if (head.taskId == taskId) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        TaskNode current = head;

        while (current.next != null &&
               current.next.taskId != taskId) {

            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task Deleted Successfully.");
        } else {
            System.out.println("Task Not Found.");
        }
    }
}