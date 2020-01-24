import javax.swing.*;
import java.awt.*;

public class Point extends JPanel {

    public Point(Color backColor) {
        setBackground(backColor);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.fillRect(x - 5, y - 5, 10, 10);
    }

}