package org.example.task2.exception;

public class CustomerException extends Exception{

    String error;

    public CustomerException(String error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return "Покупателя с именем " + error + " не существует.";
    }
}
