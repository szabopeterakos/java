package UnOrdered.Plus;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Animation extends JPanel implements Runnable {

    List<Animation> balls = new ArrayList<Animation>();
    Color color;
    int diameter;
    long delay;
    private int x;
    private int y;
    private int vx;
    private int vy;

    public Animation(String ballcolor, int xvelocity, int yvelocity) {
        if (ballcolor == "red") {
            color = Color.red;
        } else if (ballcolor == "blue") {
            color = Color.blue;
        } else if (ballcolor == "black") {
            color = Color.black;
        } else if (ballcolor == "white") {
            color = Color.white;
        }
        diameter = 30;
        delay = 40;
        x = 1;
        y = 1;
        vx = xvelocity;
        vy = yvelocity;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(color);
        g.fillOval(x, y, 50, 50); //adds color to circle
    }

    public void run() {
        while (isVisible()) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
            move();
            repaint();
        }
    }

    public void move() {
        if (x + vx < 0 || x + diameter + vx > getWidth()) {
            vx *= -1;
        }
        if (y + vy < 0 || y + diameter + vy > getHeight()) {
            vy *= -1;
        }
        x += vx;
        y += vy;
    }

    private void start() {
        while (!isVisible()) {
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                System.exit(1);
            }
        }
        Thread thread = new Thread(this);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.start();
    }

    public static void main(String[] args) {
        Animation ball2 = new Animation("white", 4, 2);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(ball2);
        f.setSize(400, 400);
        f.setLocation(200, 200);
        f.setVisible(true);
        new Thread(ball2).start();
    }
}