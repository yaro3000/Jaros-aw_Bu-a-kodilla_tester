package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.util.Set;

public class WeatherService {

    private Client client;
    private Set<Location> location;

    public void addPerson(Person person) {
        this.client = client;
    }

    public void addLocation(Set<Location> location) {
        this.location = location;
    }

    public void sendNotificationToAll(Notification notification) {
        this.client.receive(notification);
    }

    public void sendNotificationToSubscribers(Notification notification) {
        if(location.equals(client)) {
            this.client.receive(notification);
        }
    }

    public void removeLocation(Set<Location> location) {
        this.location.remove(location);
    }

    public void removeAllLocations(Set<Location> location) {
        this.location.removeAll(location);
    }
}
