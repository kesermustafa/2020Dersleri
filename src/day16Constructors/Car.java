package day16Constructors;

public class Car {

	int price; 
	int year;
	String make;
	String model;
	String color;
	boolean isDiesel;
	double km;
	
	public Car(int price, int year, String make, boolean isDiesel) {
		this.price = price;
		this.year = year;
		this.make = make;
		this.isDiesel = isDiesel;
	}
	
	public Car (int price, int year, String make, String model, String color, boolean isDiesel, double km) {
		this.price = price;
		this.year = year;
		this.make = make;
		this.isDiesel = isDiesel;
		this.color = color;
		this.km = km;
		this.model = model;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car(5000, 2018, "Toyota", true);
				
		System.out.println(car1.price);
		System.out.println(car1.year);
		System.out.println(car1.make);
		System.out.println(car1.isDiesel);
		
		System.out.println("=====");
		
		Car car2 = new Car(80000, 2020, "Audi", false);
		
		System.out.println(car2.price);
		System.out.println(car2.year);
		System.out.println(car2.make);
		System.out.println(car2.isDiesel);
		
		System.out.println("=====");
		
		Car car3 = new Car(30000, 2017, "BMW", "3.35i", "Red", false, 5000);
		System.out.println(car3.price);
		System.out.println(car3.year);
		System.out.println(car3.make);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.isDiesel);
		System.out.println(car3.km);
		
		System.out.println("=====");
		
		Car car4 = new Car(45000, 2022, "Mercedes", "CLK", "Gri", true, 0);
		System.out.println(car4.price);
		System.out.println(car4.year);
		System.out.println(car4.make);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.isDiesel);
		System.out.println(car4.km);
		
		System.out.println("=====");

		
		
		
		
	}
}
