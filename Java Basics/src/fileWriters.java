import java.io.FileWriter;
import java.io.IOException;

public class fileWriters {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
