package org.example.classwork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args) {

        //testIntegerCollection();
        testStringCollection();

    }


    public static void testIntegerCollection() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18);
        List<String> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .skip(2)
                .limit(4)
                .map(n -> n * n)
                .sorted(Comparator.reverseOrder())
                .map(n -> "Number: " + n)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void testStringCollection() {
        List<String> strings = Arrays.asList("Java", "Java", "Python", "JavaScript", "C++", "Java", "JavaFX");
        List<Person> result = strings.stream()
                .filter(s -> s.startsWith("J"))
                .distinct()
                .skip(1)
                .limit(2)
                .map(String::toUpperCase)
                .sorted()
                .map(s -> s + "!")
                .map(s -> Person.builder()
                        .name("Oleg")
                        .secondName("Olegov")
                        .build())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}








































