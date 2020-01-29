import javax.swing.*;

import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.awt.event.*;

public class ColorPanel extends JPanel {

    private Circle c1, c2;
    private Circle selectedCircle;
    private ImageIcon image;
    private int x, y;

    public ColorPanel(Color backColor, int width, int height) {
        setBackground(backColor);
        setPreferredSize(new Dimension(width, height));
    }

    public ColorPanel(Color backColor) {
        setBackground(backColor);
        c1 = new Circle(200, 100, 25, Color.red);
        c2 = new Circle(100, 100, 50, Color.blue);
        selectedCircle = null;
        // x = 100;
        // y = 100;
        addMouseListener(new PanelListener());
        addMouseMotionListener(new PanelMotionListener());
    }

    public ColorPanel(Color backColor, ImageIcon i) {
        setBackground(backColor);
        image = i;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        c1.fill(g);
        c2.draw(g);
    }

    private class PanelListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            x = (int)e.getX();
            y = (int)e.getY();
            if (c1.containsPoint(x, y))
                selectedCircle = c1;
            else if (c2.containsPoint(x, y))
                selectedCircle = c2;
        }

        public void mouseReleased(MouseEvent e) {
            selectedCircle = null;
        }

    }

    private class PanelMotionListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            if (selectedCircle != null) {
                int newX = (int)e.getX();
                int newY = (int)e.getY();
                int dx = newX - x;
                int dy = newY - y;
                selectedCircle.move(dx, dy);
                x = newX;
                y = newY;
                repaint();
            }
        }

    }

}