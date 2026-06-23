public class EmployeeManagementSystem {

    private EmployeeRecord[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new EmployeeRecord[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(EmployeeRecord employee) {

        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee Added Successfully.");
        } else {
            System.out.println("Employee Array is Full.");
        }
    }

    // Search Employee
    public EmployeeRecord searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }

        return null;
    }

    // Traverse Employees
    public void traverseEmployees() {

        System.out.println("\nEmployee Records:");

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {

        int index = -1;

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found.");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted Successfully.");
    }

    public static void main(String[] args) {

        EmployeeManagementSystem system =
                new EmployeeManagementSystem(10);

        system.addEmployee(
                new EmployeeRecord(101,
                        "Alice",
                        "Manager",
                        75000));

        system.addEmployee(
                new EmployeeRecord(102,
                        "Bob",
                        "Developer",
                        60000));

        system.addEmployee(
                new EmployeeRecord(103,
                        "Charlie",
                        "Tester",
                        50000));

        system.traverseEmployees();

        System.out.println("\nSearch Result:");
        EmployeeRecord employee =
                system.searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        }

        system.deleteEmployee(102);

        system.traverseEmployees();
    }
}