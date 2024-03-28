package Exercise3;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to check if the sides form a valid triangle
    public boolean checkSides() throws IllegalTriangleSideException {
        // Check the triangle inequality theorem
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            return true;
        } else {
            throw new IllegalTriangleSideException("The sides do not form a valid triangle.");
        }
    }

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

