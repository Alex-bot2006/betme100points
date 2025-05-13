import java.util.ArrayList;
import java.util.Arrays;

public class TaskSolution {
    public static void main(String[] args) {
        // ===== Завдання №1 =====
        int[] A = {5, 12, -3, 7, 9, 15, 4, 2};
        int m = 4;
        int k = 6;

        int countGreaterThanK = 0;
        int countGreaterThan2m = 0;

        int minValue = A[0];
        int minIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > k) countGreaterThanK++;
            if (A[i] > 2 * m) countGreaterThan2m++;
            if (A[i] < minValue) {
                minValue = A[i];
                minIndex = i;
            }
        }

        System.out.println("Завдання 1");
        System.out.print("Massif A: ");
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println("m = " + m + ", k = " + k);
        System.out.println("Number of elements > k: " + countGreaterThanK);
        System.out.println("Number of elements > 2*m: " + countGreaterThan2m);
        System.out.println("Minimal element: " + minValue + ", index: " + minIndex);

        // ===== Завдання №2 =====
        int[] original = {1, 2, 0, 0, 3, 4, 0, 0, 0, 5, 6, 0, 7, 8, 0, 0};
        ArrayList<Integer> cleaned = new ArrayList<>();
        boolean lastWasZero = false;

        for (int num : original) {
            if (num == 0) {
                if (!lastWasZero) {
                    cleaned.add(0);
                    lastWasZero = true;
                }
            } else {
                cleaned.add(num);
                lastWasZero = false;
            }
        }

        System.out.println("Завдання 2");
        System.out.print("Original massif: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.print("Cleaned massif:");
        for (int num : cleaned) {
            System.out.print(num + " ");
        }
    }
}
