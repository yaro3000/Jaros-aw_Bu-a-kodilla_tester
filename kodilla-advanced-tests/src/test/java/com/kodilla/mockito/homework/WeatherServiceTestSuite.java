package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    Location location = Mockito.mock(Location.class);
    Person person = Mockito.mock(Person.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void savedPersonShouldReceiveNotification() {
        weatherService.addPerson(person, location);
        weatherService.sendNotificationToLocation(notification, location);

        Mockito.verify(person, Mockito.times(1)).receive(notification);
    }

    @Test
    public void savedPersonCanDeleteSubscriptionFromLocation() {
        weatherService.addPerson(person, location);
        weatherService.removeFromLocation(person, location);

        Mockito.verifyNoInteractions(person, location);
    }

    @Test
    public void notificationShouldBeSendToOnlySavedPersons() {
        weatherService.sendNotificationToLocation(notification, location);

        Mockito.verify(person, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSendNotificationToAllPersons() {
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Person person3 = Mockito.mock(Person.class);

        weatherService.addPerson(person, location);
        weatherService.addPerson(person1, location);
        weatherService.addPerson(person2, location);
        weatherService.addPerson(person3, location);

        weatherService.sendNotificationToAll(notification);

        Mockito.verify(person, Mockito.times(1)).receive(notification);
        Mockito.verify(person1, Mockito.times(1)).receive(notification);
        Mockito.verify(person2, Mockito.times(1)).receive(notification);
        Mockito.verify(person3, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldDeleteDirectLocation() {
        weatherService.addPerson(person, location);
        weatherService.removeLocation(location);

        Mockito.verify(person, Mockito.never()).equals(location);
    }
}
