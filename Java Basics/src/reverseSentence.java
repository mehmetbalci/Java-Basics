import java.util.*;
import java.util.stream.Collectors;

public class reverseSentence {
	public static String reverseWords(String str){
	     List<String> words=Arrays.asList(str.split(" "));
	     Collections.reverse(words);
	     return words.stream().collect(Collectors.joining(" "));
	     
	     
	}

	public static void main(String[] args) {
		String s="The greatest victory is that which requires no battle";
		System.out.println(reverseWords(s));
	}

}
