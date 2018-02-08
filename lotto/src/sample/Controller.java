package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    @FXML
    private TextField inputNums;
    @FXML
    private Label labWhatIDid;
    @FXML
    private Label labResoult;
    @FXML
    private Button buttonOK;

    List<String> numset = new ArrayList<>();
    List<Integer> foundedSet = new ArrayList<>();
    private int counter = 0;
    private int needThis = 44;
    private int found;

    public void toResoult() {
        //initialize first action
        if (counter == 0) {
//            String inputlist = inputNums.getText();
            String inputlist = "1,44,55,6,7,6";
            numset = Arrays.asList(inputlist.split(","));
            for (int i = 0; i < numset.size(); i++) {
                foundedSet.add(i);
            }
            System.out.println(numset);
        }

        System.out.println(foundedSet);

        if (counter < numset.size()) {
            int actNum = randomGen(numset);
            found = Integer.parseInt(numset.get(actNum));
            System.out.println("founded: " + found);

            labResoult.setText(needThis == found ? "I found that. counter: " + counter : "I need more click. counter: " + counter);
        }

    }

    private int randomGen(List numset) {
        int num = (int) (Math.random() * numset.size());

        if (counter != 0 && foundedSet.contains(num)) {
            return randomGen(numset);
        }

        foundedSet.remove(num);
        counter++;

        return num;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Start");
    }
}
