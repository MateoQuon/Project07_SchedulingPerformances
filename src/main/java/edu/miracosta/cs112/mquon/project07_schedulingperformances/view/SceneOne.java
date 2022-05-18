package edu.miracosta.cs112.mquon.project07_schedulingperformances.view;

import edu.miracosta.cs112.mquon.project07_schedulingperformances.controller.Controller;
import edu.miracosta.cs112.mquon.project07_schedulingperformances.model.Performance;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class SceneOne extends Scene {
    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;

    private Controller controller = Controller.getInstance();
    private ObservableList<Performance> performancesList;
    private Performance selectedPerformance;

    // Label, TextField, ImageView, ComboBox, ListView<E>, Button
    private ImageView LDImage = new ImageView();

    private TextField nameTF = new TextField();
    private ComboBox<String> userTypeCB = new ComboBox<String>();
    private Button nextBT = new Button("Next");

    public SceneOne() {
        super(new GridPane(), WIDTH, HEIGHT);
        GridPane pane = new GridPane();
        pane.setHgap(10.0);
        pane.setVgap(5);
        pane.setPadding(new Insets(5));

        // Images: TODO: download Lion Image
        //LDImage.getImage(new Image(""));

        // TextField:
        pane.add(new Label("What is your name? "), 0, 0);
        pane.add(nameTF, 1, 0);
        // ComboBox:
        pane.add(new Label("Are you a performer? "), 0, 1);
        userTypeCB.getItems().addAll("Yes","No");
        userTypeCB.getSelectionModel().select(-1);
        pane.add(userTypeCB, 1, 1);
        // Button:
        nextBT.setOnAction(e -> nextScene());
        pane.add(nextBT, 0, 2);



        this.setRoot(pane);
    }

    private void nextScene() {
        if (userTypeCB.getSelectionModel().getSelectedItem() == "No")
            ViewNavigator.loadScene("Schedule a Lion Dance Performance", new SceneTwo());
    }
}
