import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the student management system.");
        System.out.println("View our menu:");
        System.out.println("_______________________________________________");

        while (running) {
            System.out.println("1. Add student");
            System.out.println("2. View All students");
            System.out.println("3. Find student by ID");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");

            System.out.print("\nEnter your option: ");
            String input = scanner.nextLine();
            System.out.println();

            switch (input) {
                case "1":
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character
                    System.out.print("Enter student class: ");
                    String studentClass = scanner.nextLine();
                    Student student = new Student(studentId, studentName, studentAge, studentClass);
                    management.addStudent(student);
                    System.out.println("Student added to the system successfully.");
                    break;
                case "2":
                    management.displayAllStudents();
                    break;
                case "3":
                    System.out.print("Enter student ID: ");
                    studentId = scanner.nextLine();
                    Student foundStudent = management.findStudent(studentId);
                    if (foundStudent != null) {
                        foundStudent.getDetails();
                    } else {
                        System.out.println("No student found.");
                    }
                    break;
                case "4":
                    System.out.print("Enter student ID to update: ");
                    studentId = scanner.nextLine();
                    foundStudent = management.findStudent(studentId);
                    if (foundStudent != null) {
                        System.out.print("Enter new student name: ");
                        studentName = scanner.nextLine();
                        System.out.print("Enter new student age: ");
                        studentAge = scanner.nextInt();
                        scanner.nextLine(); // Clear the newline character
                        System.out.print("Enter new student class: ");
                        studentClass = scanner.nextLine();
                        management.updateStudent(studentId, studentName, studentAge, studentClass);
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("No student found, please enter a valid student ID.");
                    }
                    break;
                case "5":
                    System.out.print("Enter student ID to delete: ");
                    studentId = scanner.nextLine();
                    management.deleteStudent(studentId);
                    break;
                case "6":
                    System.out.println("Terminating the program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose an option from the menu.");
            }
        }
        scanner.close();
    }
}
