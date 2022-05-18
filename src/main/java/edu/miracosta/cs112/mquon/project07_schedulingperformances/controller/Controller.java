package edu.miracosta.cs112.mquon.project07_schedulingperformances.controller;

import edu.miracosta.cs112.mquon.project07_schedulingperformances.model.Model;
import edu.miracosta.cs112.mquon.project07_schedulingperformances.model.Performance;
import javafx.collections.ObservableList;

public class Controller {
    private static Controller theInstance;
    private ObservableList<Performance> mPerformancesList;


    private Controller(){}

    public ObservableList<Performance> getPerformances() {return mPerformancesList; }

    public static Controller getInstance() {
        if (theInstance == null) {
            theInstance = new Controller();
            if (Model.binaryFileHasData())
                theInstance.mPerformancesList = Model.populateListFromBinaryFile();
        }
        return theInstance;
    }
}
