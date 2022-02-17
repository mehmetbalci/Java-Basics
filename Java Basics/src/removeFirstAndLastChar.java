import java.lang.String;

public class removeFirstAndLastChar {
	
	public static String remove(String str) {
	      return str.substring(1,str.length()-1);        
	}
	
	public static String boolToWord(boolean b)
	  {
	    return b==true ? "Yes":"No";
	  }
	

	public static void main(String[] args) {
		String s ="Name";
		System.out.println(remove(s));
		System.out.println(boolToWord(true));

	}

}
