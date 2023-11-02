package org.example.hw.services;

import org.example.hw.model.Student;

import java.util.Comparator;
import java.util.List;


public class StudentService {

    public void bestStudentIt(List<Student> studentList, String speciality, double avg) {
        List<String> result = studentList.stream()
                .filter(s -> s.getSpeciality().equals(speciality))
                .filter(s -> s.getAverageGrade() >= avg)
                .map(s -> "avg: " +  s.getAverageGrade() + " " + s)
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .toList();
        System.out.println(result);
    }
}
