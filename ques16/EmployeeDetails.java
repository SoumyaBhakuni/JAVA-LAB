import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Employee ID (2001 - 5001): ");
            int empId = Integer.parseInt(scanner.nextLine());
            if (empId < 2001 || empId > 5001) {
                throw new InvalidEmployeeException("Invalid Employee ID. It should be between 2001 and 5001.");
            }

            System.out.print("Enter Employee Name (First letter capital): ");
            String empName = scanner.nextLine();
            if (!Character.isUpperCase(empName.charAt(0))) {
                throw new InvalidEmployeeException("Employee name should start with a capital letter.");
            }

            System.out.print("Enter Department ID (1 - 5): ");
            int deptId = Integer.parseInt(scanner.nextLine());
            if (deptId < 1 || deptId > 5) {
                throw new InvalidEmployeeException("Invalid Department ID. It should be between 1 and 5.");
            }

            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + empId);
            System.out.println("Name: " + empName);
            System.out.println("Department ID: " + deptId);

        } catch (InvalidEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter correct data.");
        }
    }
}
