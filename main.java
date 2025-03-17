import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Завдання №1
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int birthYear = 2025 - age;
        System.out.println("Your year of birth: " + birthYear);
        
        // Завдання №2
        System.out.print("Enter radius R1 (larger): ");
        float R1 = scanner.nextFloat();
        
        System.out.print("Enter radius R2 (smaller): ");
        float R2 = scanner.nextFloat();
        
        if (R1 > R2) {
            float pi = 3.14f;
            float S1 = pi * R1 * R1;
            float S2 = pi * R2 * R2;
            float S3 = S1 - S2;
            
            System.out.println("Area of the first circle: " + S1);
            System.out.println("Area of the second circle: " + S2);
            System.out.println("Ring area: " + S3);
        } else {
            System.out.println("Error: R1 must be greater than R2.");
        }
        
        scanner.close();
    }
}
