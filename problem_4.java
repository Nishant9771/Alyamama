import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation do you want to perform?");
        System.out.println("1. Generate squares of even numbers");
        System.out.println("2. Slice the original list");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter the list of integers:");
        List<Integer> integers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String str : input) {
            integers.add(Integer.parseInt(str));
        }

        if (choice == 1) {
            List<Integer> evenSquares = integers.stream()
                                                 .filter(n -> n % 2 == 0)
                                                 .map(n -> n * n)
                                                 .collect(Collectors.toList());

            System.out.println("List of squares of even numbers: " + evenSquares);

        } else if (choice == 2) {

            System.out.println("Enter start index:");
            int startIndex = scanner.nextInt();
            System.out.println("Enter end index:");
            int endIndex = scanner.nextInt();

            List<Integer> subList = integers.subList(startIndex, endIndex);

            System.out.println("Sublist: " + subList);

        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }
    }
}
