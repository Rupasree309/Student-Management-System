import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("6. Update Student");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                scanner.next(); // clear wrong input
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                case 6:
                    updateStudent();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    public static void addStudent() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        // Prevent duplicate roll number
        for (Student s : students) {
            if (s.rollNumber == roll) {
                System.out.println("Error: Roll Number already exists!");
                return;
            }
        }

        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();

        students.add(new Student(name, roll, grade));
        System.out.println("Student added successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.displayStudent();
            }
        }
    }

    public static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        for (Student s : students) {
            if (s.rollNumber == roll) {
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        for (Student s : students) {
            if (s.rollNumber == roll) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void updateStudent() {
        System.out.print("Enter Roll Number to update: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        for (Student s : students) {
            if (s.rollNumber == roll) {
                System.out.print("Enter new Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Grade: ");
                String newGrade = scanner.nextLine();

                s.name = newName;
                s.grade = newGrade;

                System.out.println("Student information updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}