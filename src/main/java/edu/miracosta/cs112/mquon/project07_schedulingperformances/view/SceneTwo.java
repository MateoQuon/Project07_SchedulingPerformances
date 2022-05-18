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

public class SceneTwo extends Scene {
    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;

    private Controller controller = Controller.getInstance();
    private ObservableList<Performance> performancesList;
    private Performance selectedPerformance;

    // Label, TextField, ImageView, ComboBox, ListView<E>, Button
    private ImageView LDImage = new ImageView();

    private TextField nameTF = new TextField();
    private Label dayLB = new Label("1");
    private Label monthLB = new Label("1");
    private Label yearLB = new Label("2022");
    private Slider dayDateSB = new Slider(1, 31, 1);
    private Slider monthDateSB = new Slider(1, 12, 1);
    private Slider yearDateSB = new Slider(2022, 2032, 2022);

    private Button submitBT = new Button();

    public SceneTwo() {
        super(new GridPane(), WIDTH, HEIGHT);
        GridPane pane = new GridPane();
        pane.setHgap(10.0);
        pane.setVgap(5);
        pane.setPadding(new Insets(5));

        // Images: TODO: download Lion Image
        //LDImage.getImage(new Image(""));

        // TextField:
        pane.add(new Label("What is the name of the performance ( or performance location)? "), 0, 0);
        pane.add(nameTF, 1, 0);
        // Slider Labels:
        pane.add(dayLB, 1, 1);
        pane.add(monthLB, 1, 2);
        pane.add(yearLB, 1, 3);
        // Sliders:
        pane.add(new Label("What will be the date of this performance? "), 0, 1);
        dayDateSB.setShowTickMarks(true);
        dayDateSB.setShowTickLabels(true);
        dayDateSB.setBlockIncrement(5);
        dayDateSB.setSnapToTicks(true);
        dayDateSB.setMajorTickUnit(5);

        monthDateSB.setShowTickMarks(true);
        monthDateSB.setShowTickLabels(true);
        monthDateSB.setBlockIncrement(5);
        monthDateSB.setSnapToTicks(true);
        monthDateSB.setMajorTickUnit(5);

        yearDateSB.setShowTickMarks(true);
        yearDateSB.setShowTickLabels(true);
        yearDateSB.setBlockIncrement(5);
        yearDateSB.setSnapToTicks(true);
        yearDateSB.setMajorTickUnit(5);

        pane.add(dayDateSB, 2, 1);
        pane.add(monthDateSB, 2, 2);
        pane.add(yearDateSB, 2, 3);


        // Button:



        this.setRoot(pane);
    }
}