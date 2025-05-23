import java.util.Scanner;

public class CredentialChecker {

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            // Перевірка логіну
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Логін повинен містити лише латинські літери, цифри та підкреслення і бути коротшим за 20 символів.");
            }

            // Перевірка паролю
            if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Пароль повинен містити лише латинські літери, цифри та підкреслення і бути коротшим за 20 символів.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль і підтвердження не збігаються.");
            }

            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Помилка: " + e.getMessage());
            return false;
        }
    }

    // Клас WrongLoginException
    public static class WrongLoginException extends Exception {
        public WrongLoginException() {
            super("Некоректний логін.");
        }

        public WrongLoginException(String message) {
            super(message);
        }
    }

    // Клас WrongPasswordException
    public static class WrongPasswordException extends Exception {
        public WrongPasswordException() {
            super("Некоректний пароль.");
        }

        public WrongPasswordException(String message) {
            super(message);
        }
    }

    // Метод main з введенням даних
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть логін: ");
        String login = scanner.nextLine();

        System.out.print("Введіть пароль: ");
        String password = scanner.nextLine();

        System.out.print("Підтвердіть пароль: ");
        String confirmPassword = scanner.nextLine();

        boolean result = checkCredentials(login, password, confirmPassword);
        System.out.println("Результат перевірки: " + result);

        scanner.close();
    }
}
