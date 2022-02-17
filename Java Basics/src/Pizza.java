//overload functions
public class Pizza {
	static int numberOfPizzas=0;
	int size;
	String type;
	int numberOfExtras;
	Pizza(){}
	Pizza(int size){
		this.size=size;	
		numberOfPizzas++;
	}
	Pizza(int size, String type){
		this.size=size;
		this.type=type;
		numberOfPizzas++;
	}
	Pizza(int size, String type, int numberOfExtras){
		this.size=size;
		this.type=type;
		this.numberOfExtras=numberOfExtras;
		numberOfPizzas++;
	}
	public String toString() {
		String myString="Your order is:"+size+"\t"+type+"\t"+numberOfExtras+"\t";
		return myString;
				
	}
}
