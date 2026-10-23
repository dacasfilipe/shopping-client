package com.ecommerce.shopping_client.exception;

public class InvalidAcessKeyException extends RuntimeException {
    public InvalidAcessKeyException() {
        super("Credenciais inválidas.");
    }
}
