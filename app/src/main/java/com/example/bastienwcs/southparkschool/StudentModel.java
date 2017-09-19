package com.example.bastienwcs.southparkschool;

/**
 * Created by bastienwcs on 19/09/17.
 */

public class StudentModel {

    private String firstname;
    private String lastname;

    public StudentModel(String newFirstname, String newLastname) {
        this.firstname = newFirstname;
        this.lastname = newLastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
