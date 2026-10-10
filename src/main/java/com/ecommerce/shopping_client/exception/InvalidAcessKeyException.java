package com.ecommerce.shopping_client.exception;

public class InvalidAccessKeyException extends RuntimeException {
    public InvalidAccessKeyException() {
        super("Credenciais inválidas.");
    }
}
