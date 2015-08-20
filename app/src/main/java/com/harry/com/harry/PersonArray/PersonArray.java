package com.harry.com.harry.PersonArray;

/**
 * Created by Harry on 8/20/15.
 */
public class PersonArray {
    private Person[] persons;
    private int nElems;

    public PersonArray(int max) {
        persons = new Person[max];
        nElems=0;
    }

    public Person find(String searchName) {
        int t=0;
        boolean found = false;
        for (int i = 0; i < nElems; i++) {
            if (persons[i].equals(searchName)) {
                t=i;
                found = true;
                break;
            }
        }
        if (found) {
            return persons[t];
        } else {
            return null;
        }
    }
}
