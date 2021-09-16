import javax.swing.*;

        import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawings {
    public static void drawImage(Graphics graphics){


        graphics.drawLine(10, 20, 100, 100);
        graphics.drawString("Cau Cana Spears", 30, 150);
        graphics.drawRect(120,30,200,100);
        graphics.fillRect(10,200,50,100);
        graphics.setColor(Color.CYAN);
        graphics.fillRect(70,200,50,100);
        graphics.setColor(new Color(178,255,182));
        graphics.fillRect(130,200,50,100);


        Random randomNumber = new Random();

        int r = randomNumber.nextInt( 256);
        int g = randomNumber.nextInt(256);
        int b = randomNumber.nextInt(256);
        graphics.setColor(new Color(r, g, b));

        graphics.fillRect(190, 200, 50, 100);
        graphics.fillOval(300, 200, 40, 90);
        int xpoints[] = {400 , 450, 500, 450};
        int ypoints[] = {300 , 200, 300, 400};

        int npoints = 4;

        graphics.fillPolygon(xpoints, ypoints, npoints);
        graphics.setColor(Color.BLUE);
        graphics.drawString("This is Center.", WIDTH/2, HEIGHT/2 );





    }








    static int WIDTH = 800;
    static int HEIGHT = 800;

    // Don't touch the code below

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
