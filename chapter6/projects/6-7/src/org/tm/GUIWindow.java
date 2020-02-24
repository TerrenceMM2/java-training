package org.tm;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GUIWindow {

	public static void main(String[] args) {
		
        Scanner reader = new Scanner(System.in);
        System.out.print("How many panels? ");
        int count = reader.nextInt();
        
		JFrame theGUI = new JFrame();
		theGUI.setTitle("GUI Program");
		theGUI.setSize(300, 200);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel panel = new ColorPanel(Color.white);
		Container pane = theGUI.getContentPane();
		pane.add(panel);
		theGUI.setVisible(true);
	}

}
