import java.util.Random;

public class random {

	public static void main(String[] args) {
		Random random = new Random();
		int x= random.nextInt(1000)+1;
		boolean y = random.nextBoolean();
		double z = random.nextDouble(100)+1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
