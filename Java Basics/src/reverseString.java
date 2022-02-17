import java.util.Arrays;

public class reverseString {

	
	public static String solution(String str) {
		StringBuilder Str=new StringBuilder(str);
		return Str.reverse().toString();
	  }
	
	public static String repeatStr(final int repeat, final String string) {
	      return string.repeat(repeat);
	    }
	
	public static void main(String[] args) {
		System.out.println(solution("Hello"));
		int a=5;
	}

}
