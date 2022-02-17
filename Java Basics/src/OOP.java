
public class OOP {

	public static void main(String[] args) {
		/*Car car1=new Car("Mercedes",2002, 390.000, "Blue");
		System.out.println(car1.color);
		car1.drive();
		
		Human human1=new Human("Michael", 44, 70.5);
		Human human2=new Human("Bob", 33, 76.7);
		
		human1.eat();
		human2.drink();*/
		//Overload Examples
		Pizza pizza1=new Pizza();
		Pizza pizza2=new Pizza(25);
		Pizza pizza3=new Pizza(32,"Big Boss");
		Pizza pizza4=new Pizza(22,"Little Finger",6);
		System.out.println(pizza4);
		System.out.println(Pizza.numberOfPizzas);
		
		Pizza[] arrayOfPizza=new Pizza[4];
		arrayOfPizza[0]=pizza1;
		arrayOfPizza[1]=pizza2;
		arrayOfPizza[2]=pizza3;
		arrayOfPizza[3]=pizza4;
		System.out.println(arrayOfPizza[3]);

	}

}


