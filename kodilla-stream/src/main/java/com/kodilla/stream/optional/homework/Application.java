package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marcin Małysz", new Teacher("Krzysztof Bolek")));
        students.add(new Student("Monika Nosowska", new Teacher("Karolina Paszcza")));
        students.add(new Student("Ewelina Dzięgała", new Teacher("Oliwier Klimczak")));
        students.add(new Student("Paulina Pliszka", new Teacher("Ilona Żmuda")));
        students.add(new Student("Seweryn Wadowski", null));
        students.add(new Student("Kuba Kot", new Teacher("Oliwier Klimczak")));
        students.add(new Student("Szczepan Pawlikowski", null));
        students.add(new Student("Damian Niemiec", null));
        students.add(new Student("Julia Kwiatkowska", new Teacher("Oliwier Klimczak")));

        Optional<List<Student>> optionalStudent = Optional.ofNullable(students);

        for (Student studentList : students) {
            if (studentList.getTeacher() == null) {
                optionalStudent.ifPresent(u -> System.out.println("Uczeń: " + studentList.getName() + " " + "Nauczyciel: " + "<undefinied>"));
            } else
                System.out.println("Uczeń: " + studentList.getName() + " " + "Nauczyciel: " + studentList.getTeacher());
        }
    }
}
