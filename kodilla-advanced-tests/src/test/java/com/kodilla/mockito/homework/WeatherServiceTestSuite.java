package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);
    Person person = Mockito.mock(Person.class);

    @Test
    public void savedPersonShouldReceiveInformation() {
    weatherService.sendNotification(notification);

    Mockito.verify(person, Mockito.never()).receive(notification);
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
