package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

public class WeatherServiceTestSuite {

    Set<Location> locations = new HashSet<>();
    WeatherService weatherService = new WeatherService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void savedPersonShouldReceiveInformation() {
        weatherService.addPerson(person);
        weatherService.addLocation(locations);

    }

    @Test
    public void savedPersonCanClearAllSubscription() {

    }

    @Test
    public void notificationShouldBeSendToOnlySavedPersons() {

    }

    @Test
    public void shouldSendNotificationToAllPersons() {

    }

    @Test
    public void shouldDeleteDirectLocation() {

    }
}
