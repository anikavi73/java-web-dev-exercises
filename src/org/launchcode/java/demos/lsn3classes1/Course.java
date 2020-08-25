package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String name;
    private double credits;
    private ArrayList<Student> roster;

    public Course(String name, double credits){
        this.name = name;
        this.credits = credits;
        this.roster = new ArrayList<>(); //empty array List
    }

}
