package org.example;

public class InvalidShoeDataException extends RuntimeException {
    public InvalidShoeDataException(String message) {
        super(message);
    }
}
