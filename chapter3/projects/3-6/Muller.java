import javax.swing.*;
import java.awt.*;

public class Muller extends JPanel {

    public Muller(Color backColor) {
        setBackground(backColor);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.drawLine(200, 200, 600, 200);
        g.drawLine(200, 200, 250, 150);
        g.drawLine(200, 200, 250, 250);
        g.drawLine(600, 200, 550, 150);
        g.drawLine(600, 200, 550, 250);
        g.drawLine(200, 300, 600, 300);
        g.drawLine(200, 300, 150, 250);
        g.drawLine(200, 300, 150, 350);
        g.drawLine(600, 300, 650, 250);
        g.drawLine(600, 300, 650, 350);
    }

}