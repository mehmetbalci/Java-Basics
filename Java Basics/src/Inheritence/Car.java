package Inheritence;

public class Car extends Vehicle {
	final int wheels=4;
	int seatNumber;
	
	Car(double speed, String material,int seatNumber){
		super(speed, material);
		this.seatNumber=seatNumber;
	}
	
	@Override
	void go() {
		System.out.println("This car is moving");
	}
	@Override
	public String toString() {
		return super.toString()+" "+this.seatNumber;
	}

}
