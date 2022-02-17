import java.lang.Math;
import java.util.Arrays;
public class integerToString {

	 public static String numberToString(int num) {
		    return String.valueOf(num);
		  }
	 
	 public static int summation(int n) {
	      int sum=0;
	      for(int i=1;i<=n;i++){
	        sum+=i;
	      }
	      return sum;
	}
	 public static int findSmallestInt(int[] args) {
		 Arrays.sort(args);
		 return args[0];
	    }
	
	public static void main(String[] args) {
		 int a=5;
		 //numberToString(a);
		 //System.out.println(summation(2));
		 int[] dizi= {12,3,12,3,4,4,5,6,7};
		 System.out.println(findSmallestInt(dizi));
	}

}
