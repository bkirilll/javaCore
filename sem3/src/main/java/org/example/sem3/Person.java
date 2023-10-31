package org.example.sem3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

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

    public static class PersonComparator<T extends Person> implements Comparator<T> {
        public int compare(T o1, T o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    }
}
