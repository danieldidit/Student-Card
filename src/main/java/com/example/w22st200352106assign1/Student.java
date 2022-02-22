package com.example.w22st200352106assign1;

/**
 * Name: Daniel Humphreys
 * Date: 1/27/2022
 * Lab 1
 */

// Create the Student class
public class Student {

    // Create three instance variables
    private String firstName;
    private String lastName;
    private int studentNumber;

    // Constructor holding three arguments
    public Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;

        // Makes first letter uppercase
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        //Validates the firstName variable
        if(firstName.matches("[A-Z][a-z][A-Za-z]*"))
            System.out.println(firstName + " is a valid name");
        else
        {
            throw new IllegalArgumentException("First name is not valid");
        }

        // Makes first letter uppercase
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        //Validates the firstName variable
        if(lastName.matches("[A-Z][a-z][A-Za-z]*"))
            System.out.println(lastName + " is a valid name");
        else
        {
            throw new IllegalArgumentException("Last name is not valid valid");
        }

        // Validates the studentNumber variable
        if (studentNumber>=200000000 && studentNumber<=299999999)

            System.out.println(studentNumber);
        else
        {
            throw new IllegalArgumentException("Student number must be 9 characters and between 200000000," +
                    " and 299999999");
        }
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public static void main(String[] args) {

        Student st = new Student("Daniel", "Humphreys", 200352106);

    }
}
