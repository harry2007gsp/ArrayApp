package com.harry.com.harry.person;

import android.util.Log;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age= a;
    }

    public void displayPerson() {
        Log.d("test", " Last name: " + lastName+" " + firstName+" " + age);
//        Log.d("test", " First name: " + firstName);
//        Log.d("test", " Age: " + age);
    }

    public String getLastName() {
        return lastName;
    }
}
