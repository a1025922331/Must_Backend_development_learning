package mo.must.day8;

public class AgeOverTheRangeException extends RuntimeException{
    public AgeOverTheRangeException() {
    }

    public AgeOverTheRangeException(String message) {
        super(message);
    }
}
