package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField inputName;
    @FXML
    private TextField inputMsg;
    @FXML
    private Label out;
    @FXML
    private Button buttonSend;

    public void toSend() {
        out.setText(message());
        buttonSend.setText("Success");
    }

    public void toReset() {
        buttonSend.setText("Send");
        out.setText("");
    }

    private String message() {
        int counterMGH = count(new ChriteriaMgh(), inputMsg.getText());
        int counterMSH = count(new ChriteriaMsh(), inputMsg.getText());
        String prefix = "Az adatok: \n";
        String mgh = "magánhangzók száma: " + counterMGH;
        String msh = "\n" + "mássalhangzók száma száma: " + counterMSH;

        return prefix + mgh + msh;
    }

    private int count(Chritertia chr, String source) {
        int counter = 0;
        for (int i = 0; i < source.length(); i++) {
            if (chr.isAble(Character.toString(source.charAt(i)))) {
                counter++;
            }
        }

        return counter;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
