import java.util.Arrays;

import org.xml.sax.helpers.AttributeListImpl;

public class FourOperations {
	public static Integer basicMath(String op, int v1, int v2)
	  {
		int res=0;
	    if(op.charAt(0)=='+')res=v1+v2;
	    else if(op.charAt(0)=='-')res=v1-v2;
	    else if(op.charAt(0)=='*')res=v1*v2;
	    else res=v1/v2;
	    return res;
	  }
	public static String abbrevName(String name) {
		String[] array=name.split(" ", 0);
	    return array[0].toUpperCase().charAt(0)+"."+array[1	].toUpperCase().charAt(0);
	  }
	public static int[] digitize(long n) {
	    StringBuilder sb = new StringBuilder(Long.toString(n)).reverse();
	    
	    return Arrays.stream(sb.toString().split(""))
	                  .mapToInt(Integer::parseInt)
	                  .toArray();
	  }

	public static void main(String[] args) {
		//System.out.println(basicMath("+",12,18));
		//System.out.println(abbrevName("Mehmet Balci"));
		long n=7654321;	
		System.out.println(digitize(n));
	}

}
