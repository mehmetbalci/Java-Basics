import java.util.ArrayList;
import java.util.Collections;
public class arrayLists {

	public static void main(String[] args) {
		ArrayList<String> foods=new ArrayList<String>();
		foods.add("Die Kartoffel");
		foods.add("Die Aubergine");
		foods.add("Die Tomate");
		foods.add(1, "Die Banane");
		foods.set(0, "Der Pilz");
		foods.indexOf("Die Banane");
		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}
		System.out.println("--------Sorted-----------");
		Collections.sort(foods);
		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}
		System.out.println("--------Reversed-----------");
		Collections.reverse(foods);
		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}
		
		//2D ARRAY LISTS
		ArrayList<ArrayList<String>> twodArrayList = new ArrayList();
		twodArrayList.add(foods);
		System.out.println(twodArrayList.get(0).get(0));
		
	
	
	}

}
