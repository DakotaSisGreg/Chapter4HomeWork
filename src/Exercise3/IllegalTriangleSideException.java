package Exercise3;

// Exception thrown when the sides of a triangle do not satisfy the conditions
public class IllegalTriangleSideException extends Exception {
    public IllegalTriangleSideException(String message) {
        super(message);
    }
}

