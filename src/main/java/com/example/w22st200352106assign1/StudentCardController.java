package com.example.w22st200352106assign1;

import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.ImageView;


public class StudentCardController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private ImageView studentImage;

    @FXML
    private Label studentNumberLabel;

    @FXML
    private Label favoriteActivitiesList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Student student = new Student("Daniel", "Humphreys", 200352106, "Sledding");

        studentImage.setImage(student.getStudentImage());
        firstNameLabel.setText(student.getFirstName());
        lastNameLabel.setText(student.getLastName());
        studentNumberLabel.setText(Integer.toString(student.getStudentNumber()));
        favoriteActivitiesList.setText(student.getActivities());


    }
}







