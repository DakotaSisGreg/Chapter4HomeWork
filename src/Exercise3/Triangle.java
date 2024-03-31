package Exercise3;

/**
 *
 * Class: Intermediate Programing ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written March 28, 2024
 *
 * This class provides a method to check if the given sides can form a valid triangle
 * and compares 3 double variables containing the length of each of the triangles three sides;
 * It will return true if and only if the sum of side1+ side2 is greater than side3 AND the
 * sum side2+side3 is greater than side1 AND the sum of side1+ side3 is greater than side2
 *
 */

public class Triangle {

    /**
     *
     * Instantiates the Triangle
     * side 1 is the first side
     * side 2 is the second side
     * side 3 is the third side
     *
     */
    private double side1;
    private double side2;
    private double side3;

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to check if the sides satisfy the conditions for the triangle
    // also throws an exception if the conditions are not satisfied
    public boolean checkSides() throws IllegalTriangleSideException {
        // Check the triangle inequality theorem
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            return true;
        } else {
            throw new IllegalTriangleSideException("The sides do not form a valid triangle.");
        }
    }

    // Creates 3 triangles to test against our conditions; program should stop
    // at the second object, as it does not satisfy our conditions
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            System.out.println("Triangle 1 is valid: " + triangle1.checkSides());

            Triangle triangle2 = new Triangle(1, 10, 12);
            System.out.println("Triangle 2 is valid: " + triangle2.checkSides());

            Triangle triangle3 = new Triangle(5, 5, 5);
            System.out.println("Triangle 3 is valid: " + triangle3.checkSides());

        } catch (IllegalTriangleSideException e) {
            System.out.println(e.getMessage());
        }
    }
}

