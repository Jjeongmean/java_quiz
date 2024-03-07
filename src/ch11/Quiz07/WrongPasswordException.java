package ch11.Quiz07;

public class WrongPasswordException extends Exception{ //일반예외
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
