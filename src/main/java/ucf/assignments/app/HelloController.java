/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Kelli Howard
 */

package ucf.assignments.app;

import javafx.fxml.FXML;

public class HelloController {
    @FXML
    public int onCreateTODOList() {
        // Here I'm going to create a new tab for a new list
        // Create new tableview object

        // If successful
        return 1;
        // Else
        // return 0
    }

    @FXML
    protected int onDeleteTODOList() {
        // Get the name of the specific list being deleted and remove the tab from the UI
        // If the list exists as a csv, delete that as well
        return 1;
    }

    @FXML
    protected int onEditTitle() {
        // Get the name of the specific list being indexed and edit its title attribute
        return 1;
    }

    @FXML
    protected int onAddItem() {
        // Get the name of the specific list being indexed
        // Create an item object
        // add the item to the list specified
        return 1;
    }

    @FXML
    protected int onDeleteItem() {
        // Get the name of the specific list being indexed
        // loop through the items in the list until the specified item is found
        // delete the item specified
        return 1;
    }

    @FXML
    protected int onEditItemDescription() {
        // Get the name of the specific list being indexed
        // loop through the items in the list until the specified item is found
        // update the description field of that item object
        return 1;
    }

    @FXML
    protected int onEditItemDueDate() {
        // Get the name of the specific list being indexed
        // loop through the items in the list until the specified item is found
        // update the due date field of that item object
        return 1;
    }

    @FXML
    protected int onMarkAsComplete() {
        // Get the name of the specific list being indexed
        // loop through the items in the list until the specified item is found
        // change an items complete attribute is marked as true
        return 1;
    }

    @FXML
    protected int onDisplayAll() {
        // Get the name of the specific list being indexed
        // loop through the items in the list
        // display every item
        return 1;
    }

    @FXML
    protected int onDisplayIncomplete() {
        // Get the name of the specific list being indexed
        // loop through the items in the list
        // display an item if its complete attribute is marked as false
        return 1;
    }

    @FXML
    protected int onDisplayComplete() {
        // Get the name of the specific list being indexed
        // loop through the items in the list
        // display an item if its complete attribute is marked as true
        return 1;
    }

    @FXML
    protected int onSaveList() {
        // Get the name of the specific list being indexed
        // loop through every item in the list
        // for every item, add it as a new line entry in the csv
        return 1;
    }

    @FXML
    protected int onSaveAllLists() {
        // Loop through every list tab
        // call onSaveList() for every item in the loop
        return 1;
    }

    @FXML
    protected int onImportSpecific() {
        // if onCreateTODOlist()
        // for every line in the csv
        // add line as a row to the new list
        // if i == length of for loop
        // set successful to true

        // If successful
        return 1;
        // Else
        // return 0
    }

    @FXML
    protected int onImportAll() {
        // Go through every CSV in the specified folder and import them
        // for every .csv in the folder
        // if onImportSpecific(csv)
        // if i == length of for loop
        // set successful to true
        // continue
        // else
        // system.out.println("there was an error importing the lists")

        // If successful
        return 1;
        // Else
        // return 0
    }
}