package com.example.w22st200352106assign1;

import javafx.scene.image.Image;

import java.util.ArrayList;

/**
 * Name: Daniel Humphreys
 * Date: 1/27/2022
 * Lab 1
 */

// Create the Student class
public class Student {

    // Create five instance variables
    private String firstName;
    private String lastName;
    private int studentNumber;
    private String activities;
    private Image studentImage;

    // Constructor holding four arguments
    public Student(String firstName, String lastName, int studentNumber, String activities) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setActivities(activities);

        // add the Student image to the object
        String fileName = String.format("images/IMG_6680.jpg");
        studentImage = new Image(getClass().getResource(fileName).toExternalForm());
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // Makes first letter uppercase
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        //Validates the firstName variable
        if(firstName.matches("[A-Z][a-z][A-Za-z]*"))
            this.firstName = firstName;
        else
        {
            throw new IllegalArgumentException("First name is not valid");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // Makes first letter uppercase
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        //Validates the lastName variable
        if(lastName.matches("[A-Z][a-z][A-Za-z]*"))
            this.lastName = lastName;
        else
        {
            throw new IllegalArgumentException("Last name is not valid");
        }
    }
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        // Validates the studentNumber variable
        if (studentNumber>=100000000 && studentNumber<=999999999)

            this.studentNumber = studentNumber;
        else
        {
            throw new IllegalArgumentException("Student number must be 9 characters and between 200000000," +
                    " and 299999999");
        }
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public Image getStudentImage() {
        return studentImage;
    }




    public static void main(String[] args) {

    }
}
