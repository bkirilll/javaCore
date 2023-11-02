package org.example.hw.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.stream.Collectors;


@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    String name;

    List<Double> grades;

    String speciality;

    public double getAverageGrade() {
        return grades.stream()
                .reduce(Double::sum)
                .get() / grades.size();
    }
}
