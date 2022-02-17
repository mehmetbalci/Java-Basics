
public class stringMethods {

public static void main(String[] args) {
	String name="richard";
	/*System.out.println(name.equals("richard"));
	System.out.println(name.equalsIgnoreCase("Richard"));
	System.out.println(name.toCharArray()[1]);
	System.out.println(name.charAt(0));
	System.out.println(name.indexOf("i"));
	System.out.println(name.indexOf('i'));
	System.out.println(name.toUpperCase());
	System.out.println(name.trim());//remove all empty spaces in string
	System.out.println(name.replace(name, "mathew"));
	System.out.println(name);
	System.out.println(name.replace('i', 'o'));
	System.out.println(name.substring(2,5));
	System.out.println(name.toUpperCase());
	System.out.println(name.compareToIgnoreCase(name));*/
	System.out.println(reverse(name));
	
	String[] words= {"richard","Mike","anna","jane","jerry","eli"};
	
	for(String i:words) {
		System.out.println(i);
	}	
	}

public static String reverse(String word) {
	String ret="";
	for (int i = word.length()-1; i >=0 ; i--) {
		ret+=word.charAt(i);
	}
	return ret;
}
}