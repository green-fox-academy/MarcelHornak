import javax.swing.*;

        import java.awt.*;
        import java.util.Random;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {

    public static void drawDiagonal(int width, int height, Graphics g) {
        Random rand = new Random();
        Color randomColor = new Color(rand.nextInt(255),
                rand.nextInt(255),
                rand.nextInt(255));
        switch (rand.nextInt(4)) {
            case 0:
                g.setColor(Color.RED);
                g.drawLine(0, 0, width, height);
                System.out.println("top left to bottom right");
                break;
            case 1:
                g.setColor(randomColor);
                g.drawLine(width, 0, 0, height);
                System.out.println("top right to bottom left");
                break;
            case 2:
                g.setColor(randomColor);
                g.drawLine(0, height, width, 0);
                System.out.println("bottom left to top right");
                break;
            case 3:
                g.setColor(randomColor);
                g.drawLine(width, height, 0, 0);
                System.out.println("bottom right to top left");
        }

    }

    public static void drawImage(Graphics graphics) {
        drawDiagonal(WIDTH, HEIGHT, graphics);
        // Create a function that draws a single line
        // Use this function to draw the canvas' diagonals
        // If the line starts from the upper-left corner it should be green, otherwise it should be red
        // Make decision about the color in the function


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
