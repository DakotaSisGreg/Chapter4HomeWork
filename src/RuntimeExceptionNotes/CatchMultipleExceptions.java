package RuntimeExceptionNotes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchMultipleExceptions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do {
            try {

                System.out.println("Enter a numerator");
                int num = input.nextInt();
                //(1)
                System.out.println("Enter a denominator");
                int denominator = input.nextInt();
                //(2)
                int result = num / denominator;
                //(3)
                flag = false;
                System.out.println("the results of the division is " + result);
                //(4)

            } catch (ArithmeticException e) {
                System.out.println(e);
                input.nextLine();
                System.out.println("Try again.");

            } catch (InputMismatchException e) {
                System.out.println(e);
                input.nextLine();
                System.out.println("Try again.");

            } catch (Exception e) {
                System.out.println(e);
                input.nextLine();
                System.out.println("Try again.");

            }
        }while(flag);
    }
}
