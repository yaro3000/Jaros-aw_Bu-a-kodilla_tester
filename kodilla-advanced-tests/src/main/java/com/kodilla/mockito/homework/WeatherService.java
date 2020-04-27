package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeatherService {

    private HashMap<Person, Set<Location>> personSetHashMap = new HashMap<>();

    public void addPerson(Person person, Location location) {
        personSetHashMap.computeIfAbsent(person, P -> new HashSet<>()).add(location);
    }

    public void sendNotificationToAll(Notification notification) {
        personSetHashMap.entrySet().stream().forEach(entry -> entry.getKey().receive(notification));
    }

    public void sendNotificationToLocation(Notification notification, Location location) {
        personSetHashMap.entrySet().stream().filter(entry -> entry.getValue().contains(location)).forEach(entry -> entry.getKey().receive(notification));
    }

    public void removeFromLocation(Person person, Location location) {
        this.personSetHashMap.entrySet().stream().filter(entry -> entry.getKey().equals(person)).forEach(entry -> entry.getValue().remove(location));
    }

    public void removeAllSubscriptions(Person person) {
        this.personSetHashMap.entrySet().removeIf(entry -> (person.equals(entry.getKey())));
    }

    public void removeLocation(Location location) {
        this.personSetHashMap.entrySet().stream().filter(entry -> entry.getValue().contains(location)).forEach(entry -> entry.getValue().remove(location));
    }
}
