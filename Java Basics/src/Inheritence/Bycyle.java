package Inheritence;

public class Bycyle extends Vehicle{
	Bycyle(double speed, String material) {
		super(speed, material);
		// TODO Auto-generated constructor stub
	}


	final int wheels=2;
	

	@Override
	void go() {
		System.out.println("This bcycle is moving");
	}
}
