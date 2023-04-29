import java.util.Scanner;

public class StudentEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left by nextInt()
        
        System.out.print("Enter student major: ");
        String major = scanner.nextLine();
        
        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}

