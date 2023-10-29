package org.example.sem3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public abstract class Person {

    private String firstName;
    private String secondName;

    private LocalDate date;

    private int salary;

    public void increase(int amount) {
        this.salary += amount;
    }

    public Person() {
    }
}
