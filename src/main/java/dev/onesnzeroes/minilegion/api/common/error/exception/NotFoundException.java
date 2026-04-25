package dev.onesnzeroes.minilegion.api.common.error.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}