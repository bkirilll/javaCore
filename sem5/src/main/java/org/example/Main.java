package org.example;


import org.example.hw.model.Student;
import org.example.hw.services.StudentService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Oleg1", List.of(5.0, 5.0, 5.0, 2.0), "it");
        Student student2 = new Student("Oleg2", List.of(5.0, 5.0, 5.0, 5.0, 4.0), "it");
        Student student3 = new Student("Oleg3", List.of(4.0, 5.0, 5.0, 3.0, 5.0), "it");
        Student student4 = new Student("Oleg4", List.of(5.0, 5.0, 2.0, 5.0), "it");
        Student student5 = new Student("Oleg5", List.of(4.0, 4.0, 4.0, 3.0), "iwet");
        Student student6 = new Student("Oleg6", List.of(4.0, 4.0, 3.0, 3.0), "it");
        Student student7 = new Student("Oleg7", List.of(4.0, 4.0, 5.0, 5.0), "it");
        Student student8 = new Student("Oleg8", List.of(4.0, 4.0, 3.0, 3.0), "iwet");
        Student student9 = new Student("Oleg9", List.of(5.0, 5.0, 5.0, 5.0), "russian");
        Student student10 = new Student("Oleg10", List.of(5.0, 5.0, 5.0, 5.0), "it");
        Student student11 = new Student("Oleg11", List.of(5.0, 5.0, 5.0, 5.0), "it");
        Student student12 = new Student("Oleg12", List.of(4.0, 4.0, 3.0, 3.0), "iwet");

        List<Student> studentList = List.of(student1, student2, student3, student4, student5, student6,
                student7, student8, student9, student10, student11, student12);
        StudentService studentService = new StudentService();
        studentService.bestStudentIt(studentList, "it", 4.5);





    }


    class Solution {
        public char findTheDifference(String s, String t) {
            char ch= t.substring(s.length());
        }
    }


}