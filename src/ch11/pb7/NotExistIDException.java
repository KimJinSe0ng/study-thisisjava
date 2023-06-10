package ch11.pb7;

public class NotExistIDException extends Exception {
    public NotExistIDException() {}

    public NotExistIDException(String message) {
        super(message);
    }
}
