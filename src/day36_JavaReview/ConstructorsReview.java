package day36_JavaReview;

public class ConstructorsReview {
	
	public ConstructorsReview() {
		
		System.out.println("Default constructor");
		
	}
	public ConstructorsReview(int a) {
		System.out.println("Constructor with argument int: "+a);
	}
	public static void main(String[] args) {
		
		/*
		 Creating object:
		     ClassName obj = new ExistingConstructor;
		     
		 Declaration of constructor:
		     access-modifier className() {
		     }
		 */
		
		ConstructorsReview obj = new ConstructorsReview();
		
		// ConstructorsReview obj = new ConstructorsReview("Batch 12");  // gives error
		     // the constructor with arg of String does not exist
		
		ConstructorsReview obj2 = new ConstructorsReview(10);
	}

}
