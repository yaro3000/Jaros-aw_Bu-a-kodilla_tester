package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal mark = new Principal("Mark Hammond");
        Principal dave = new Principal("Dave Marksman");
        Principal willy = new Principal("William Everest");

        School angel = new School("Angels", 22, 34, 12, 16, 21, 44);
        School unicorn = new School("Uniconrs", 18, 15, 26, 30);
        School apache = new School("Apache", 16, 26, 36, 11, 18);

        school.put(mark, unicorn);
        school.put(dave, apache);
        school.put(willy, angel);

        for (Map.Entry<Principal, School> schoolEntry : school.entrySet())
            System.out.println(schoolEntry.getKey().getPrincipalName() + " is principal of " + schoolEntry.getValue().getSchoolName() + " and that school has " + schoolEntry.getValue().getSum() + " students.");
    }
}
