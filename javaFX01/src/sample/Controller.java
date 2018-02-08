package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private void setLabel(){
        label.setText(Double.toString(Math.random()));
    }

}
