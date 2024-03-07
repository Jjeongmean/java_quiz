package ch11.Quiz07;

public class NotExistIDException extends Exception{ //일반예외
    public NotExistIDException() {}
    public NotExistIDException(String message) {
        super(message);
    }
}
