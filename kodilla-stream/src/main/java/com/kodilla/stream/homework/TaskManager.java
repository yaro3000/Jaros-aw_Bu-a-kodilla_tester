package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(d -> d.getDeadline().isBefore(currentDate))
                .map(TaskManager::getDeadline)
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }

    public static LocalDate getDeadline(Task task) {
        return task.getDeadline();
    }
}
