package GUISwing;

import javax.swing.*;
import java.awt.Color;


public class Main {

	public static void main(String[] args) throws Exception {
		ImageIcon icon=new ImageIcon("logo.jpg");
		//JLabel
		JLabel label = new JLabel();
		label.setText("Hello how are you  doing today?");
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.CENTER);
		JFrame frame=new JFrame();
		frame.setSize(900,900);
		frame.setVisible(true);
		frame.setTitle("Welcome to the world");
		label.setForeground(Color.green);
		label.setIconTextGap(-25);
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		frame.add(label);
		label.setIcon(icon);
		
		
		//new myFrame();
			
		 
		
		
		
		

	}

}
