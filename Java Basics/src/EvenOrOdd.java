import static java.lang.Math.abs;//static import imports specific functions from library
public class EvenOrOdd {
	
	
	    public static String even_or_odd(int number) {
	        return (number%2 == 0) ? "Even" : "Odd";
	    }
	    
	    public static int makeNegative(final int x) {
	        return -abs(x);
	      }
	    
	    //Ternary Conditional Operator
	    public static int makeNegative2(final int x) {
	        return (x < 0) ? x : -x; 
	    }

	public static void main(String[] args) {
		System.out.println(even_or_odd(0));
		System.out.println(even_or_odd(1));
		
		System.out.println(makeNegative(1));
		System.out.println(makeNegative(1));

	}

}
