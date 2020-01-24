import javax.swing.*;
import java.awt.*;

public class Mauritius {

    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("Flag of Mauritius");
        theGUI.setSize(800, 600);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.yellow);
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.green);
        Container pane = theGUI.getContentPane();
        pane.setLayout(new GridLayout(4, 1));
        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);
        pane.add(panel4);
        theGUI.setVisible(true);
    }

}