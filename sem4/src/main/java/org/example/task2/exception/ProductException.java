package org.example.task2.exception;

public class ProductException extends Exception{
    String error;

    public ProductException(String error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return "Товара с таким наименованием " + error + " не существует.";
    }
}
