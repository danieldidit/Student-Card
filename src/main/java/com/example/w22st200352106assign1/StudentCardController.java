package com.example.w22st200352106assign1;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/**
 * Author: Daniel Humphreys
 * Date: 2/23/2022
 * Assignment 1
 */

public class StudentCardController implements Initializable {

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private ImageView studentImage;

    @FXML
    private Label studentNumberLabel;

    @FXML
    private ListView<String> favoriteActivitiesList;

    /**
     *This initialize method contains the student object, and updates the view with all of its values, as well as
     * the image. It then adds activities to the activities ArrayList and updates the view with its values.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Instantiates a new Student object
        Student student = new Student("Daniel", "Humphreys", 2003521);

        // Updates the view image, first and last name, and student number
        studentImage.setImage(student.getStudentImage());
        firstNameLabel.setText(student.getFirstName());
        lastNameLabel.setText(student.getLastName());
        studentNumberLabel.setText(Integer.toString(student.getStudentNumber()));

        // Adds several activities to the activities ArrayList
        student.addActivities("Exercise");
        student.addActivities("Music Production");
        student.addActivities("Video Games");
        student.addActivities("Photography");
        student.addActivities("Movies");

        // Updates the view activities list
        favoriteActivitiesList.getItems().addAll(student.getActivities());

        // applies a shadow effect to the studentImage
        studentImage.setEffect(new DropShadow(20, Color.BLACK));
    }
}







