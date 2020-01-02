package day47_JavaReview;

public class Quiz {
	
	//q1:
	int x,y;
	
	public Quiz (int x, int y) {  // constructor
		initialize(x,y);
	}
	public void initialize  (int x, int y) {  // instance method
		this.x=x*x;
		this.y=y*y;
	}
	public static void main(String[] args) {
		int x = 3, y=5;
		Quiz obj = new Quiz(x,y);  // object of the class
		                          // we call the constructor with this object, however the only constructor we have in class is the one
		                          // with arguments, so we have to give the arguments in the parenthesis as (x,y)
	System.out.println(x+" "+y ); // we are not calling the x and y through the object, we are just calling the local variables
	//                 3     5
	
	
	// q2:
	
	int amount;  // instance variable
	  // line 1
	{
		amount = 100;
	}
	
	}

}
