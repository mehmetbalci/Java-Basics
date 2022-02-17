
public class swicth2 {

	public static void main(String[] args) {
		String[] days= new String[10];
		String[][] weeks=new String[3][10];
		String day="Monay";
		days[0]=day;
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
		
		switch (day) {
		case "Monday": {
			System.out.println("Monday");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpectedddddd"+day);
		}

	}

}
