import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    System.out.print("Input: ");
    int decimalNumber = scanner.nextInt();
    
    if (decimalNumber < 0) {
        System.out.println("Please enter a positive decimal number.");
    } else {
        String binaryNumber = convertDecimalToBinary(decimalNumber);
        System.out.println("Output: " + binaryNumber);
    }
    
    scanner.close();
}

public static String convertDecimalToBinary(int decimalNumber) {
    Stack<Integer> stack = new Stack<>();
    

    if (decimalNumber == 0) {
        return "0";
    }

    while (decimalNumber > 0) {
        int remainder = decimalNumber % 2;
        stack.push(remainder);
        decimalNumber = decimalNumber / 2;
    }
    
    StringBuilder binaryNumber = new StringBuilder();
    while (!stack.isEmpty()) {
        binaryNumber.append(stack.pop());
    }
    
    return binaryNumber.toString();
}
}
