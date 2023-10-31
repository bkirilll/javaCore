package org.example.task1;

public class WrongLoginException extends Exception {
    String string;

    public WrongLoginException(String string) {
        this.string = string;
    }

    @Override
    public String getMessage() {
        return "Ошибка с вводом логина - " + string + ". Длина логина должна быть меньше 20 символов";
    }
}
