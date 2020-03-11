package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        LocalDate myDate = LocalDate.of(2020, 01, 15);
        LocalDate myDate1 = LocalDate.of(2020, 02, 03);
        LocalDate myDate2 = LocalDate.of(2020, 03, 05);
        LocalDate myDate3 = LocalDate.of(2020, 02, 22);
        LocalDate myDate4 = LocalDate.of(2020, 01, 30);
        LocalDate myDate5 = LocalDate.of(2020, 03, 10);

        LocalDate deadline = LocalDate.of(2020, 02, 25);
        LocalDate deadline1 = LocalDate.of(2020, 02, 20);
        LocalDate deadline2 = LocalDate.of(2020, 03, 30);
        LocalDate deadline3 = LocalDate.of(2020, 03, 8);
        LocalDate deadline4 = LocalDate.of(2020, 03, 30);
        LocalDate deadline5 = LocalDate.of(2020, 05, 5);

        tasks.add(new Task("Wash the car", myDate, deadline));
        tasks.add(new Task("Enroll your child in a doctor", myDate1, deadline1));
        tasks.add(new Task("Book your vacation", myDate2, deadline2));
        tasks.add(new Task("Visit mom", myDate3, deadline3));
        tasks.add(new Task("Take out a life insurance policy", myDate4, deadline4));
        tasks.add(new Task("Put up a plot for sale", myDate5, deadline5));
        return tasks;
    }
}
