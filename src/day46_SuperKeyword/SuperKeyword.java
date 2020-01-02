package day46_SuperKeyword;

class A {
	String name = "Madina";
	
	public void methodA() {
		
	}
	public A(int a) {  // constructor with an argument
	//      argument	
	}
	}

public class SuperKeyword extends A {
	      //  sub                super
	
	public SuperKeyword(int a) {
		super(10);  // super class constructor must be called in the sub class.
		  // this one calls the constructor "public A(int a)"
	}
	
	/*
	 String name = "Madina";
	 */
	
	public void method() {
		
	}

}
