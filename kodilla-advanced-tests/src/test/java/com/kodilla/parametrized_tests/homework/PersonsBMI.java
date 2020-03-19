package com.kodilla.parametrized_tests.homework;

import java.util.ArrayList;
import java.util.List;

public class PersonsBMI {

//    static Stream<Arguments> personList() {
//        return Stream.of(
//                Arguments.of(new Person(1.70,55)),
//                Arguments.of(new Person(1.55,80)),
//                Arguments.of(new Person(1.75,40)),
//                Arguments.of(new Person(1.80,130)),
//                Arguments.of(new Person(1.60,92)),
//                Arguments.of(new Person(1.64,61)),
//                Arguments.of(new Person(1.33,40)),
//                Arguments.of(new Person(1.90,88))
//        );
//    }

    public static List<Person> personList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1.70,55));
        persons.add(new Person(1.55,80));
        persons.add(new Person(1.75,40));
        persons.add(new Person(1.80,130));
        persons.add(new Person(1.60,92));
        persons.add(new Person(1.64,61));
        persons.add(new Person(1.33,40));
        persons.add(new Person(1.90,88));
        return persons;
    }
}
