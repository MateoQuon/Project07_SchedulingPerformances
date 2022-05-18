package edu.miracosta.cs112.mquon.project07_schedulingperformances.view;

import edu.miracosta.cs112.mquon.project07_schedulingperformances.controller.Controller;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class View extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewNavigator.setStage(primaryStage);
        //primaryStage.getIcons().add(new Image(""));
        ViewNavigator.loadScene("Lion Dance Performance Scheduler", new SceneOne());
    }
}
