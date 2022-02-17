package interfacces;
//interfaces are like templates and can be applicable to classes
//similar to inheritance but it can be specify what class must do
//inheritamce limited to one super class but interfaces can multiple 

public class Main {

	public static void main(String[] args) {
		Fish fish = new Fish();
		Shark shark = new Shark();
		fish.hide();
		shark.hunt();

	}

}
