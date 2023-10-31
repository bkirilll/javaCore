package org.example.task1;

public class WrongPasswordException extends Exception {
    String string1;
    String string2;

    public WrongPasswordException(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    @Override
    public String getMessage() {
        return "Длина " + string1 + " больше 20 символов или пароли - " + string1 + " и " + string2 + " не совпадают";
    }
}
