package org.example.sem3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

public class Employee extends Person {


    public Employee(String firstName, String secondName, LocalDate date, int salary) {
        super(firstName, secondName, date, salary);
    }

    public static void increaseAllSalary(TreeSet<Person> set, int amount) {
        for (Person worker: set) {
            worker.increase(amount);
        }
    }
}
