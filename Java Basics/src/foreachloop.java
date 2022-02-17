import java.util.ArrayList;

public class foreachloop {

	public static void main(String[] args) {
		String[] array= {"cat","dog","mouse","bird","horse"};
		ArrayList<String> animals=new ArrayList<String>();
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		
		for(String i:animals) {
			System.out.println(i);
		}
		
		for(String i:array) {
			System.out.println(i);
		}
		
		System.out.printf("This is a format string example %.2f %d %b %c",345.7,45, false,'c');

	}

}
