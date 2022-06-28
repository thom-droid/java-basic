package exception;

public class SomeException extends Exception{

    public SomeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SomeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }
}
