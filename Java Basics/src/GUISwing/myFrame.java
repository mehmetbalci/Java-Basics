package GUISwing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame {
	myFrame(){
		this.setSize(900,900);
		this.setVisible(true);
		this.setTitle("Welcome to the world");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		ImageIcon image=new ImageIcon("myLogo-circle.png");
		this.setIconImage(image.getImage());//change icon of this
		this.getContentPane().setBackground(Color.white);
	}
}
