import javax.swing.JOptionPane;

public class GUIIntro {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Wie heiﬂt du?");
		int age =Integer.parseInt(JOptionPane.showInputDialog("Whie alt bist du:")); 
		JOptionPane.showMessageDialog(null, "Hallo "+name+". Du bist "+age+" jahre alt.");
	}

}
