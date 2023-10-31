package org.example.task2.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Customer {

    String name;

    Gender gender;

    public enum Gender{MALE, FEMALE}
}
