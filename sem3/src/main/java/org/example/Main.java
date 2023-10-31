package org.example;

import org.example.sem3.Employee;
import org.example.sem3.Manager;
import org.example.sem3.Person;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<>(new Person.PersonComparator<>());

        Person person1 = new Employee("Oleg", "Olegovich", LocalDate.of(1990, 12, 2), 50000);
        Person person2 = new Employee("Ivan", "Ivanovich", LocalDate.of(2000, 9, 10),  60000);
        Person person3 = new Employee("Andrey", "Olegovich", LocalDate.of(1989, 5, 6),56000);
        Person person4 = new Manager("Oleg", "Olegovich", LocalDate.of(1995, 2, 25), 80000);
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);
        System.out.println(treeSet);
        Manager.increaseAllSalary(treeSet, 4000);

        System.out.println(treeSet);

    }
}