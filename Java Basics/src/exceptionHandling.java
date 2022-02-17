import java.util.InputMismatchException;
import java .util.Scanner;
public class exceptionHandling {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			
			System.out.println("Enter a number");
			int x= scanner.nextInt();
			System.out.println("Enter a number");
			int y= scanner.nextInt();
			int z=x/y;
			System.out.println("result :"+z);
		}
		catch(ArithmeticException e) {
			System.out.println("You cant divide by 0");
			
		}
		catch(InputMismatchException e) {
			System.out.println("You need to enter numbers");
		}
		catch(Exception e) {
			System.out.println("Something wrong");
		}
		finally {
			scanner.close();
			System.out.println("All done ");
		}
		
	}

}
