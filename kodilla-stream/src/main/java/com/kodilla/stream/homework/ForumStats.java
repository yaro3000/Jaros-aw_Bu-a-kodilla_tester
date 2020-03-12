package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averagePostOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(avg -> avg.getNumberOfPosts())
                .mapToInt(avg -> avg)
                .average()
                .getAsDouble();
        System.out.println("Średnia liczba postów użytkowników w wieku 40 lat i więcej: " + averagePostOver40);

        double averagePostUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(avg -> avg.getNumberOfPosts())
                .mapToInt(avg -> avg)
                .average()
                .getAsDouble();
        System.out.println("Średnia liczba postów użytkowników poniżej 40 roku życia: " + averagePostUnder40);
    }
}
