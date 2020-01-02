package day49_Recap;

public class Rectangle extends Shape {
	
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		
		this.length=length;
		this.width = width;
	}
	
	
	protected void Area() {
		double Area = length*width;
		System.out.println("Area is: "+Area);
	}

	protected void perimeter() {
		double perimeter = (length+width)*2;
		System.out.println("perimeter of the rectange is"+perimeter);
	}

}
