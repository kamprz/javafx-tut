package main.java.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StackPaneController
{
    @FXML
    private Button buttonId;

    public StackPaneController(){}

    @FXML
    void initialize()
    {
        buttonId.setText("Nowa nazwa");

        EventHandler<MouseEvent> handler = event -> System.out.println("Najechano");
        EventHandler<MouseEvent> handler2 = event -> {
            System.out.println("Kliknięto");
            buttonId.removeEventHandler(MouseEvent.MOUSE_ENTERED,handler);
            Stage s = (Stage)buttonId.getScene().getWindow();
            s.close();
        };
        buttonId.addEventHandler(MouseEvent.MOUSE_CLICKED,handler2);
        buttonId.addEventHandler(MouseEvent.MOUSE_ENTERED,handler);
    }



    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println("Mouse entered");
    }
}
