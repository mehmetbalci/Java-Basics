package Inheritence;

public class Vehicle {
	double speed;
	String material;
	
	Vehicle(double speed, String material){
		this.speed=speed;
		this.material=material;
	}
	
	void go() {
		System.out.println("This vehicle is moving");
	}
	void stop() {
		System.out.println("This vehicle stopped");
	}
	@Override
	public String toString() {
		return this.speed+" "+this.material;
	}
}
