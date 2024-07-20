import java.util.Scanner;

public class TriangleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of lines : ");
                    int lines = scanner.nextInt();
                    displayRightAngleTriangle(lines);
                    break;
                case 2:
                    System.out.print("Enter the number of lines : ");
                    lines = scanner.nextInt();
                    displayPalindromicTriangle(lines);
                    break;
                case 3:
                    displayHelp();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Display a right-angle triangle of ones");
        System.out.println("2. Display a Palindromic Triangle");
        System.out.println("3. Help");
        System.out.println("4. Exit");
    }

    public static void displayRightAngleTriangle(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

    public static void displayPalindromicTriangle(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void displayHelp() {
        System.out.println("Help:");
        System.out.println("A Palindromic Triangle is a triangular array of numbers where each row forms a palindrome The first few lines of a Palindromic Triangle are:");
        System.out.println("1\n121\n12321\n1234321");
        System.out.println("You can use this pattern to draw a Palindromic Triangle for any number of lines.");
    }
}
