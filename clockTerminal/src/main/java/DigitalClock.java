import javax.swing.*;
import java.awt.event.ComponentAdapter;

public class DigitalClock extends JFrame {
    private JPanel panel1;
    private JLabel l1;

    Thread t = new Thread() {
        @Override
        public void run() {
            super.run();
            l1.setText("ok");
        }
    };

    public static void main(String[] args) {

    }
}
