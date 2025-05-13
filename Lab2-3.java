import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Calculation of y = (a*x^2 + b) / sqrt(|a+b|)
        System.out.println("Calculation of the function y = (a*x^2+b)/sqrt(|a+b|)");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c (start of the interval): ");
        double c = sc.nextDouble();
        System.out.print("Enter d (end of the interval): ");
        double d = sc.nextDouble();
        System.out.print("Enter h (step): ");
        double h = sc.nextDouble();

        double denom = sqrt(abs(a + b));
        System.out.println();
        if (h <= 0 || denom == 0) {
            System.out.println("Invalid data: the step must be positive, and sqrt(|a+b|) cannot be 0.");
        } else {
            System.out.printf("%-10s %-10s%n", "x", "y");
            for (double x = c; x <= d; x += h) {
                double y = (a * x * x + b) / denom;
                System.out.printf("%-10.4f %-10.4f%n", x, y);
            }
        }

        // Task 2: Calculation of y = cos^3(z+a) - x, where z = x^5 + a*x + b^3
        System.out.println("Task 2: Calculation of the function y = cos^3(z+a) - x, where z = x^5+a*x+b^3");
        System.out.print("Enter a: ");
        double a2 = sc.nextDouble();
        System.out.print("Enter b: ");
        double b2 = sc.nextDouble();
        System.out.print("Enter T (upper bound for x; lower bound is 0): ");
        double T = sc.nextDouble();

        double hx = 0.2; // fixed step
        double maxY = -Double.MAX_VALUE;
        double maxX = 0;
        System.out.println();
        System.out.printf("%-10s %-10s%n", "x", "y");
        for (double x = 0; x <= T; x += hx) {
            double z = pow(x, 5) + a2 * x + pow(b2, 3);
            double y = pow(cos(z + a2), 3) - x;
            System.out.printf("%-10.4f %-10.4f%n", x, y);
            if (y > maxY) {
                maxY = y;
                maxX = x;
            }
        }
        System.out.println("Maximum y: " + maxY);
        System.out.println("Corresponding x: " + maxX);

        sc.close();
    }
}
