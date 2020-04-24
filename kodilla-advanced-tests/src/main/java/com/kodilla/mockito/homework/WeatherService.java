package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.HashSet;
import java.util.Set;

public class WeatherService {

    private Set<Person> client = new HashSet<>();
    private Set<Location> location = new HashSet<>();
    private int age;

    public void addPerson(Person person, int age) {
        this.client.add(person);
        this.age = age;
    }

    public void addLocation(Location location) {
        this.location.add(location);
    }

    public void addPersonToLocation(Person person, Location location) {

    }

    public void sendNotification(Notification notification) {
        if (location.equals(client)) {
            this.client.forEach(client -> client.receive(notification));
        }
    }

    public void sendNotificationToAll(Notification notification) {
        this.client.forEach(client -> client.receive(notification));
    }

    public void sendNotificationToSubscribersInLocalization(Location location, Notification notification) {
        if (location.equals(client)) {
            this.client.forEach(client -> client.receive(notification));
        }
    }

    public void removePersonFromLocation(Person person, Location location) {

    }

    public void removeLocation(Set<Location> location) {
        this.location.remove(location);
    }

    public void removeAllLocations(Set<Location> location) {
        this.location.removeAll(location);
    }
}
