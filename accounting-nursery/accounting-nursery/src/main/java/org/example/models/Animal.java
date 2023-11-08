package org.example.models;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Animal {

    int id;

    String name;

    String type;

    Date birthDate;

    int weight;

    public Animal(String name, String type, Date birthDate, int weight) {
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.weight = weight;
    }
}
