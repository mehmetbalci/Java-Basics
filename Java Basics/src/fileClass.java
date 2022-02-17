import java.io.File;
import java.io.IOException;

public class fileClass {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\MEHMET\\Desktop\\secret.txt");
		if(file.exists()) {
			System.out.println("That file exits");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {
			System.out.println("That doesnt exits");
		}
	}
}
