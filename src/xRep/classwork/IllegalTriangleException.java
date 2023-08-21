package xRep.classwork;

public class IllegalTriangleException extends RuntimeException{
    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException() {
        super("wrong triangle's sides");
    }
}
