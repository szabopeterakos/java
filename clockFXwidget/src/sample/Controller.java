package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.LocalTime;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label clock;

    Thread th = new Thread() {
        @Override
        public void run() {
            super.run();
            try {
                for (; ; ) {
                    LocalTime lt = LocalTime.now();
                    clock.setText(lt.toString());

                    sleep(1000);
                }

            } catch (InterruptedException ie) {
            }
        }
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        th.start();
    }
}
