package encapsulation;

public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	Car(Car car){
		this.setMake(car.getMake());
		this.setModel(car.getModel());
		this.setYear(car.getYear());
	}
	
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public int getYear() {
		return this.year;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public void setYear(int year) {
		this.year=year;
	}
	//how to copy one object into another
	public void copy(Car car) {
		this.setMake(car.getMake());
		this.setModel(car.getModel());
		this.setYear(car.getYear());
		
		
		
		
		
		
		
		
		
	}
}
