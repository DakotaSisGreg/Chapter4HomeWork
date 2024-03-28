package RuntimeExceptionNotes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumExceptionHandling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum;
        boolean validInput = true;

        do {
            validInput = true;
            sum = 0;
            System.out.println("Enter two integers: ");
            try {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                sum = num1 + num2;
            } catch (InputMismatchException ex) {
                System.out.println("Error: Input Mismatch Exception has occurred.");
                validInput = false;
                input.nextLine();
            }
        } while (!validInput);

    }
}
