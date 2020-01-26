import javax.swing.*;
import java.awt.*;

public class Board {

    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setSize(1000, 1000);
        theGUI.setTitle("Checkerboard");

        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = theGUI.getContentPane();
        pane.setLayout(new GridLayout(8, 8));

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row % 2) == (col % 2)) {
                    ColorPanel panel = new ColorPanel(Color.black);
                    pane.add(panel);
                } else {
                    ColorPanel panel = new ColorPanel(Color.red);
                 pane.add(panel);
                }
            }
        }
        theGUI.setVisible(true);
    }

}