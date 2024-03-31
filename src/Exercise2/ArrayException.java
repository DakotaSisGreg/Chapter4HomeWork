package Exercise2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Class: Intermediate Programing ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written March 28, 2024
 *
 * This program creates an array filled with random double values and prompts
 * the user to enter an index to access a value in the array. It demonstrates
 * handling invalid inputs and out-of-bounds array access
 */

public class ArrayException {

    /**
     *  Fills an array with random doubles and allows the user to access an element
     *  by specifying an index. It checks for and handles exceptions related to
     *  invalid index or non-integer inputs.
      * @param args
     */

    public static void main(String[] args) {

        double[] numbers = new double[50];
        Random random = new Random();

        // Fill the array with random doubles in the range 0 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
        }

        Scanner scanner = new Scanner(System.in);
        boolean flag = false; // Flag to control the loop for valid index input

        do {
            System.out.print("Enter an index between 0 and 49: ");
            try {
                int index = scanner.nextInt();

                // Check if the index is within the bounds of the array (0 - 100)
                if (index < 0 || index >= numbers.length) {

                    throw new ArrayIndexOutOfBoundsException();
                }

                // If the index is valid, print the array value at the specified index
                System.out.println("The value at index " + index + " is " + numbers[index]);
                flag = true; // Set flag to true to exit the loop

            } catch (ArrayIndexOutOfBoundsException e) { // Handling out of bounds index input
                System.out.println("The index you entered is out of bounds. Please enter an index between 0 and 49.");
            } catch (InputMismatchException e) { //Gets rid of the invalid input
                System.out.println("Invalid input detected. Please ensure you enter an integer value.");
                scanner.next();
            }
        } while (!flag); // Closes the scanner
    }
}
