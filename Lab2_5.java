import java.util.Scanner;

public class Lab2_5 {
    public static void main(String[] args) {
        final int ROWS = 4;
        final int COLS = 5;
        int[][] matrix = new int[ROWS][COLS];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array elements 4x5:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] products = new int[COLS];

        for (int j = 0; j < COLS; j++) {
            int product = 1;
            boolean found = false;
            for (int i = 0; i < ROWS; i++) {
                int value = matrix[i][j];
                if (value >= 10 && value < 55) {
                    product *= value;
                    found = true;
                }
            }
            products[j] = found ? product : 0;
        }

        System.out.println("Vector products (elements >= 10 та < 55 in each column):");
        for (int j = 0; j < COLS; j++) {
            System.out.print(products[j] + " ");
        }

        scanner.close();
    }
}
