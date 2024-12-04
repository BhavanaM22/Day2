import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate the sum
        int sum = number1 + number2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
