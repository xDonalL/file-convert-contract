package org.example.exception;

public class InvalidMinioPathException extends RuntimeException {

    public InvalidMinioPathException(String path) {
        super("Invalid MinIO path: " + path);
    }
}
