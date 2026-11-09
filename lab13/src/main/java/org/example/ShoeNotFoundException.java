package org.example;

public class ShoeNotFoundException extends RuntimeException {
    public ShoeNotFoundException(String message) {
        super(message);
    }
}
