package FUN;

import javax.swing.*;

import java.awt.Dimension;

import java.awt.Toolkit;

class Calc extends JFrame {

    JTextField ques, answer;

    private Toolkit toolkit;

    public Calc() {

        JPanel panel = new JPanel();

        getContentPane().add(panel);

        panel.setLayout(null);

        // UIManager.LookAndFeelInfo laf[]=UIManager.getInstalledLookAndFeels();

        setSize(300, 200);

        setTitle("Easy Calculator");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        toolkit = getToolkit();

        Dimension size = toolkit.getScreenSize();

        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        ques = new JTextField();

        answer = new JTextField();

        JButton calculate = new JButton("Calculate");

        calculate.setBounds(75, 50, 90, 30);

        ques.setBounds(10, 10, 220, 30);     // Positioning of TextField(JTextField)

        answer.setBounds(10, 100, 220, 30); //Positioning  of TextField(JTextField)

        panel.add(calculate);

        panel.add(ques);    // Adding TextField(JTextField) in JPanel

        panel.add(answer);  // Adding TextField(JTextField) in JPanel

    }

    public static void main(String args[]) {

        Calc cal = new Calc();

        cal.setVisible(true);

    }

}
