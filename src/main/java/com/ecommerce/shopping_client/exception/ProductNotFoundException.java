package com.ecommerce.shopping_client.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException() {
        super("Produto não encontrado.");
    }
}
