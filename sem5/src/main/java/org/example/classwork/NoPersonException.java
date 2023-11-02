package org.example.classwork;

public class NoPersonException extends RuntimeException{

    public NoPersonException(String name) {
        super(String.format("Нет пользователя с таким name - \"%s\".", name));
    }
}
