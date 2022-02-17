package Inheritence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vh=new Vehicle(0, null);
		Car car1=new Car(0, null, 0);
		Bycyle bc1=new Bycyle(0, null);
		vh.go();
		bc1.go();
		car1.go();
		bc1.stop();
		System.out.println(bc1.wheels);
		System.out.println(car1.wheels);
	}

}
