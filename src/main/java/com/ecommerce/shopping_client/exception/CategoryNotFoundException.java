package com.ecommerce.shopping_client.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException() {
        super("Categoria não encontrada.");
    }
}
