package com.harry.com.harry.person;

import android.util.Log;

/**
 * Created by hsingh on 8/20/15.
 */
public class PersonArray {
    private Person[] persons;
    private int nElems;

    public PersonArray(int max) {
        persons = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int t=0;
        boolean found = false;
        for (int i = 0; i < nElems; i++) {
            if (persons[i].getLastName().equals(searchName)) {
                t=i;
                found=true;
                break;
            }
        }
        if (found) {
            return persons[t];
        } else {
            return null;
        }
    }

    public void insert(String last, String first, int age) {
        persons[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int t=0;
        boolean found = false;
        for (int i = 0; i < nElems; i++) {
            if (persons[i].getLastName().equals(searchName)) {
                t=i;
                found = true;
                break;
            }
        }
        for (int k = t; k < nElems; k++) {
            persons[k] = persons[k + 1];

        }
        nElems--;
        if (found) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            persons[i].displayPerson();
        }
    }
}
