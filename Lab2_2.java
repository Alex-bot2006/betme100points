import java.util.Scanner;

public class MathCalculations {
    // Завдання №1
    public static double calculateZ1(double alpha) {
        return 2 * Math.pow(Math.sin(3 * Math.PI - 2 * alpha), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * alpha), 2);
    }
    
    public static double calculateZ2(double alpha) {
        return (1.0 / 4) - (1.0 / 4) * Math.sin((5.0 / 2) * Math.PI - 8 * alpha);
    }
    
    // Завдання №2
    public static double calculateF(double x) {
        if (x < 0) {
            return -4;
        } else if (x >= 0 && x < 1) {
            return Math.pow(x, 2) + 3 * x + 4;
        } else {
            return Math.pow(Math.pow(x, 2) + 3 * x + 4, 2);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Завдання №1
        System.out.print("Enter the value alpha: ");
        double alpha = scanner.nextDouble();
        
        double z1 = calculateZ1(alpha);
        double z2 = calculateZ2(alpha);
        
        System.out.println("Result Z1: " + z1);
        System.out.println("Result Z2: " + z2);
        
        // Завдання №2
        System.out.print("Enter the value x: ");
        double x = scanner.nextDouble();
        
        double f = calculateF(x);
        System.out.println("Result f(x): " + f);
        
        scanner.close();
    }
}
