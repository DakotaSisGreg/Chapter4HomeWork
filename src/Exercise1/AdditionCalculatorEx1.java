package Exercise1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AdditionCalculatorEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        boolean isValidInput;

        do {
            try {
                System.out.print("Enter the first integer: ");
                firstNumber = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                secondNumber = scanner.nextInt();
                isValidInput = true; // Input is valid, break the loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input detected. Please ensure you enter integer values.");
                isValidInput = false; // Keep the loop going for another iteration
                scanner.nextLine();
            }
        } while (!isValidInput); // Loop until valid input is provided

        int sum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);

        scanner.close();
    }
}
