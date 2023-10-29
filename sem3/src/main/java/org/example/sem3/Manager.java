package org.example.sem3;


import java.time.LocalDate;
import java.util.TreeSet;

public class Manager extends Employee {


    public Manager(String firstName, String secondName, LocalDate date, int salary) {
        super(firstName, secondName, date, salary);
    }

    public static void increaseAllSalary(TreeSet<Person> set, int amount) {
        for (Person worker : set) {
            if (!(worker instanceof Manager)) {
                worker.increase(amount);
            } ;
        }
    }
}
