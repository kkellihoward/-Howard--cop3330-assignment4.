/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Kelli Howard
 */

package ucf.assignments.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    public void onCreateTODOListWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onCreateTODOList());
    }

    @Test
    public void onDeleteTODOListWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onDeleteTODOList());
    }

    @Test
    public void onEditTitleWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onEditTitle());
    }

    @Test
    public void onAddItemWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onAddItem());
    }

    @Test
    public void onDeleteItemWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onDeleteItem());
    }

    @Test
    public void onEditItemDescriptionWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onEditItemDescription());
    }

    @Test
    public void onEditItemDueDateWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onEditItemDueDate());
    }

    @Test
    public void onMarkAsCompleteWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onMarkAsComplete());
    }

    @Test
    public void onDisplayAllWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onDisplayAll());
    }

    @Test
    public void onDisplayIncompleteWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onDisplayIncomplete());
    }

    @Test
    public void onDisplayCompleteWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onDisplayComplete());
    }

    @Test
    public void onSaveListWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onSaveList());
    }

    @Test
    public void onSaveAllListsWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onSaveAllLists());
    }

    @Test
    public void onImportSpecificWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onImportSpecific());
    }

    @Test
    public void onImportAllWorking() {
        HelloController controller = new HelloController();
        Assertions.assertEquals(1, controller.onImportAll());
    }
}