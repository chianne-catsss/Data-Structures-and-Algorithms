import java.util.HashMap;
import java.util.Scanner;

// 1. Created an OOP Class to handle the student data and operations
class StudentOperations {
    private HashMap<Integer, String> students = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // Method replacing hardcoded values with user inputs
    public void runOperations() {
        // // ADD ELEMENTS (User Input)
        System.out.println("Enter 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            students.put(id, name);
        }
        students.put(1004, "Ana Reyes"); // Duplicate Key demonstration

        // // DISPLAY ALL STUDENTS
        System.out.println("\nAll Students:");
        System.out.println(students);

        // // DISPLAY A SPECIFIC STUDENT
        System.out.println("\nStudent with ID 1002:");
        System.out.println(students.get(1002));

        // // UPDATE A STUDENT'S NAME
        students.put(1003, "Pedro Ramirez");
        System.out.println("\nAfter Updating Student ID 1003:");
        System.out.println(students);

        // // REMOVE A STUDENT
        students.remove(1001);
        System.out.println("\nAfter Removing Student ID 1001:");
        System.out.println(students);

        // // CHECK IF A KEY EXISTS
        System.out.println("\nIs Student ID 1005 existing?");
        System.out.println(students.containsKey(1005));

        // // DISPLAY NUMBER OF STUDENTS
        System.out.println("\nTotal Students:");
        System.out.println(students.size());

        // // CLEAR ALL ELEMENTS
        students.clear();

        // // DISPLAY ALL ELEMENTS
        System.out.println("\nAfter Clearing All Students:");
        System.out.println(students);
    }
}

// 2. Main class to run the object
public class Main {
    public static void main(String[] args) {
        StudentOperations myStudents = new StudentOperations(); // Creating an Object (OOP)
        myStudents.runOperations(); // Running the encapsulated code
    }
}