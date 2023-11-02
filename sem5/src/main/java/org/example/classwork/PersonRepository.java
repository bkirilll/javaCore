package org.example.classwork;

import java.util.Optional;

public class PersonRepository {

    public Optional<Person> findByName(String name) {
        if(name.equals("name")) {
            return Optional.of(new Person("Oleg", "Olegov"));
        }
        return Optional.empty();
    }



















































}
