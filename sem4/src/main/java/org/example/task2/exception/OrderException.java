package org.example.task2.exception;

public class OrderException extends Exception {

    int error;

    public OrderException(int error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return "Количество не может быть отрицательным.";
    }
}
