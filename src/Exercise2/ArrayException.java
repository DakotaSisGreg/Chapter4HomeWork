package Exercise2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayException {

    public static void main(String[] args) {

        double[] numbers = new double[50];
        Random random = new Random();

        // Fill the array with random doubles in the range [0, 100)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
        }

        Scanner scanner = new Scanner(System.in);
        boolean flag = false; // Flag to control the loop

        do {
            System.out.print("Enter an index between 0 and 49: ");
            try {
                int index = scanner.nextInt();

                // Check if the index is within the bounds of the array
                if (index < 0 || index >= numbers.length) {

                    throw new ArrayIndexOutOfBoundsException();
                }

                // If the index is valid, print the array value at the specified index
                System.out.println("The value at index " + index + " is " + numbers[index]);
                flag = true; // Set flag to true to exit the loop

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The index you entered is out of bounds. Please enter an index between 0 and 49.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input detected. Please ensure you enter an integer value.");
                scanner.next();
            }
        } while (!flag);
    }
}
