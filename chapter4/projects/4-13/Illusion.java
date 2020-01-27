import javax.swing.*;
import java.awt.*;

public class Illusion {

    public static void main(String[] args) {
        
        JFrame theGUI = new JFrame();
        theGUI.setSize(1000, 1000);
        theGUI.setTitle("Checkerboard");

        String inputStr = JOptionPane.showInputDialog("Number of rows", "5");
        if (inputStr == null) return;
        int rows = Integer.parseInt(inputStr);
        inputStr = JOptionPane.showInputDialog("Number of columns", "5");
        if (inputStr == null) return;
        int cols = Integer.parseInt(inputStr);

        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = theGUI.getContentPane();
        pane.setLayout(new GridLayout(rows, cols));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i % 2) == (j % 2)) {
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