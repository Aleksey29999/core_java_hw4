package org.example.w4_1;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
