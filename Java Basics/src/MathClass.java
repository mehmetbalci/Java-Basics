import javax.swing.JOptionPane;
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		double edge1=Double.parseDouble(JOptionPane.showInputDialog("What are edges:"));
		double edge2=Double.parseDouble(JOptionPane.showInputDialog("What are edges:"));
		double hip=Math.sqrt(edge1*edge1+edge2*edge2);
		
		JOptionPane.showConfirmDialog(null,"Hypotenuse: "+ hip );		
		Scanner scan= new Scanner(System.in);
		System.out.println("What are edges:");
		edge1=scan.nextDouble();
		System.out.println("What are edges:");
		edge2=scan.nextDouble();
		hip=Math.sqrt(Math.pow(edge1, 2)+Math.pow(edge2, 2));
		JOptionPane.showConfirmDialog(null,"Hypotenuse: "+ hip );
	}
}