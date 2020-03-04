package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Integer> schools = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, Integer... schools) {
        this.schoolName = schoolName;
        for (Integer school : schools)
            this.schools.add(school);
    }

    public int getSum() {
        int sum = 0;
        for (int number : schools)
            sum += number;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schools, school.schools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schools);
    }

    @Override
    public String toString() {
        return "School{" +
                "schools=" + schools +
                '}';
    }
}
