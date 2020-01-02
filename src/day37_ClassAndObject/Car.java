package day37_ClassAndObject;

public class Car {
	
	/*
	 car
    data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..
	 */
	
	String Model;
	int Year;
	String Color;
	double Price;
	long Mileage;
	String Brand;
	
	 public void drive() {
		 
		 System.out.println("Driving "+Brand);
	 }
	 
	 public void start() {
		 System.out.println(Brand+" is starting");
	 }
	 
	 //2020 Toyota Corolla, white, $1000
	 public void getInfo() {
		 System.out.println(Year+" "+Brand+" "+Model+", "+Color+" "+Mileage+" miles "+Price);
	 }

}
