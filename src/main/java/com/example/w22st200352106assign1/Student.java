package com.example.w22st200352106assign1;
import javafx.scene.image.Image;
import java.util.ArrayList;
import java.util.Objects;


/**
 * Author: Daniel Humphreys
 * Date: 2/23/2022
 * Assignment 1
 */

// Creates a Student class
public class Student {

    // Creates 5 instance variables
    private String firstName;
    private String lastName;
    private int studentNumber;
    private Image studentImage;
    private ArrayList<String> activities;

    /**
     * Constructor that holds three arguments, initializes a new ArrayList object,
     *  and adds the student image to a studentImage object.
     */
    public Student(String firstName, String lastName, int studentNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        activities = new ArrayList<>();

        // add the Student image to the studentImage object
        String fileName = String.format("images/IMG_6680.jpg");
        studentImage = new Image(getClass().getResource(fileName).toExternalForm());
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    /**
     *This method makes the first letter of the first name upper case and then validates the variable
     * by making sure that it only accepts names with 2 or more characters
     * @param firstName stores the Student's first name. Must be 2 or more characters.
     */
    public void setFirstName(String firstName) {
        // Makes first letter uppercase
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        //Validates the firstName variable
        if(firstName.matches("[A-Z][a-z][A-Za-z]*"))
            this.firstName = firstName;
        else
        {
            throw new IllegalArgumentException("First name is not valid. Must contain at least 2 characters");
        }
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    /**
     *This method makes the first letter of the first name upper case and then validates the variable
     * by making sure that it only accepts names with 2 or more characters
     * @param lastName stores the Student's last name. Must be 2 or more characters.
     */
    public void setLastName(String lastName) {
        // Makes first letter uppercase
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        //Validates the lastName variable
        if(lastName.matches("[A-Z][a-z][A-Za-z]*"))
            this.lastName = lastName;
        else
        {
            throw new IllegalArgumentException("Last name is not valid. Must contain at least 2 characters");
        }
    }

    // Getter for studentNumberS
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     *This method validates studentNumber by making sure it is between 1000000 & 9999999 and then sets it.
     * @param studentNumber stores the Student's student number. Must be between 1000000 & 9999999.
     */
    public void setStudentNumber(int studentNumber) {
        // Validates the studentNumber variable
        if (studentNumber>=1000000 && studentNumber<=9999999)

            this.studentNumber = studentNumber;
        else
        {
            throw new IllegalArgumentException("Student number must be 9 characters and between 200000000," +
                    " and 299999999");
        }
    }

    // Getter for studentImage
    public Image getStudentImage() {
        return studentImage;
    }

    // Getter for activities
    public ArrayList<String> getActivities() {
        return activities;
    }

    /**
     *This method validates the newActivity by making sure it doesn't contain an empty string,
     * then it adds it to the Arraylist.
     * @param newActivity stores a new activity in the ArrayList of activities.
     */
    public void addActivities(String newActivity)
    {
        // Validates newActivity
        if (Objects.equals(newActivity, ""))
        {
            throw new IllegalArgumentException("Activity must not be empty");
        }
        else
            activities.add(newActivity);
    }
}
