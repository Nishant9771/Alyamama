import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        System.out.println("Enter your email address:");
        String email = scanner.nextLine();

        boolean isUsernameValid = isValidUsername(username);
        boolean isPasswordValid = isValidPassword(password);
        boolean isEmailValid = isValidEmail(email);

        System.out.println("Username is " + (isUsernameValid ? "valid." : "invalid."));
        System.out.println("Password is " + (isPasswordValid ? "valid." : "invalid."));
        System.out.println("Email is " + (isEmailValid ? "valid." : "invalid."));

        scanner.close();
    }

    private static boolean isValidUsername(String username) {
        return username != null && !username.isEmpty() && username.length() <= 50;
    }

    private static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasSpecial = false;
        boolean hasNumber = false;
        boolean hasUpper = false;
        boolean hasLower = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }
        return hasSpecial && hasNumber && hasUpper && hasLower;
    }

    private static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }
        String local = parts[0];
        String domain = parts[1];
        if (!local.matches("[a-zA-Z0-9]+") || !domain.matches("[a-zA-Z0-9]+\\.[a-zA-Z]+")) {
            return false;
        }
        return true;
    }
}
