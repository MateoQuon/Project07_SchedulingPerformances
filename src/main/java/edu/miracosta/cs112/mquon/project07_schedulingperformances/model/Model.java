package edu.miracosta.cs112.mquon.project07_schedulingperformances.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;

public class Model {

    public static final String BINARY_FILE = "performances.dat";


    public static boolean binaryFileHasData() {
        File binaryFile = new File(BINARY_FILE);
        return (binaryFile.exists());
    }

    public static ObservableList<Performance> populateListFromBinaryFile() {
        // New list
        ObservableList<Performance> performancesList = FXCollections.observableArrayList();
        try {
            ObjectInputStream fileReader = new ObjectInputStream(new FileInputStream(BINARY_FILE));
            Performance[] array = (Performance[]) fileReader.readObject();
            // Loop thru array and add each performance to the list
            for (Performance p: array) {
                performancesList.add(p);
            }
            fileReader.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return performancesList;
    }

    public static boolean writeDataToBinaryFile(ObservableList<Performance> performancesList) {
        // List --> Array --> BinaryFile
        Performance[] array = new Performance[performancesList.size()];
        // Copy all the list data into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = performancesList.get(i);
        }
        // Write to the binary file
        try {
            ObjectOutputStream fileWriter = new ObjectOutputStream(new FileOutputStream(BINARY_FILE));
            fileWriter.writeObject(array);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }
}
