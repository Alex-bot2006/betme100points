import java.util.Scanner;

public class Lab2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Перевірка на паліндром
        System.out.println("Enter a string to check for palindrome:");
        String input = scanner.nextLine();

        // Підготовка: видалення проб і рзд
        String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome..");
        }

        // "cat" на "dog"
        System.out.println("Enter text to replace the word 'cat' with 'dog':");
        String text = scanner.nextLine();

        String replacedText = text.replaceAll("cat", "dog");
        System.out.println("The result of the replacement:" + replacedText);

        scanner.close();

    }
}
