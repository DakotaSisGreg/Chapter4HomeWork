package Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class: Intermediate Programing ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written March 28, 2024
 *
 * This class -> is designed to add two integers inputted by the user.
 * It handles invalid inputs by prompting the user to re-enter the integers.
 */
public class AdditionCalculatorEx1 {

    /**
     *
     * The main method is the entry point of the program.
     * It takes two integers from the user, adds them, and displays the sum as an output.
     * The program also includes a do-while loop, which will continuously prompt the user for a proper integer
     * until its conditions are satisfied to display a correct output.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialization of variables close to their usage
        int firstNumber = 0;
        int secondNumber = 0;
        boolean isValidInput; //Tells us if the input is valid or not

        do {
            try {
                System.out.print("Enter the first integer: ");
                firstNumber = scanner.nextInt();

                System.out.print("Enter the second integer: ");
                secondNumber = scanner.nextInt();

                isValidInput = true; // input is valid, satisfies the condition and proceeds
            } catch (InputMismatchException e) {
                System.out.println("Invalid input detected. Please ensure you enter integer values.");
                isValidInput = false; // Invalid input, continue the loop and prompt user for valid input
                scanner.nextLine(); // clears up scanner space
            }
        } while (!isValidInput);

        //Calculates the two valid integers and displays the sum of the two integers
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);

        scanner.close(); // Closing the scanner
    }
}
