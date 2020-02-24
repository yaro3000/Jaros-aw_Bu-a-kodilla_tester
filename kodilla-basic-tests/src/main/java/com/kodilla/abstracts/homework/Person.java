package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job ) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        Policeman policeman = new Policeman();
        Fireman fireman = new Fireman();

        Person kamil = new Person("Kamil", 25, doctor.getResponsibilities());
        Person ola = new Person("Ola", 33, policeman.getResponsibilities());
        Person jan = new Person("Jan", 40, fireman.getResponsibilities());
        Person przemek = new Person("Przemek", 30, policeman.getResponsibilities());
        Person monika = new Person("Monika", 18, fireman.getResponsibilities());

        Person[] people = {kamil, ola, jan, przemek, monika};

        String peopleJob = null;

        for (int i = 0; i <= people.length; i++) {
            peopleJob = people[i].firstName + people[i].job;
        }
        System.out.println(peopleJob);
    }
}


