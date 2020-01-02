package day36_JavaReview;

public class ConstructorCalls {
	
	/*
	 1. Only a constructor can call another constructor.
	 2. Constructor cannot be called by constructor name.
	 3. We use "this()" keyword to call
	 */
	
public ConstructorCalls() {
		
		System.out.println("A");
		
	}
	
	public ConstructorCalls(int a){
		//ConstructorCalls();
		
	//	System.out.println("B"); // constructor call has to be the first step in a constructor
		this();  // A
		System.out.println("B");
		
	}
	
	public ConstructorCalls(double a) {
		
		this(10);  // A B
		//this();    // one constructor can only call one constructor
		System.out.println("C"); // C
		
	}
	
	public static void main(String[] args) {
		method1();
	//	ConstructorCalls();
		
		ConstructorCalls obj  = new ConstructorCalls( 10.5 );  // A B
		
	}
	
	public static void method1() {
	
	}
	
	public static void method2() {
		method1();
	}

}
