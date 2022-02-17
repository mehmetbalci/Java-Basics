package encapsulation;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet", "Camaro", 2021);
		Car car2 = new Car("Mercedes", "EQS", 2022);
		Car car3= new Car(car2);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		car1.copy(car2);
		System.out.println(car1.getMake());
		System.out.println(car2.getMake());
		
		
	}

}
