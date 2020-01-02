package day34_Constructors;

import java.lang.reflect.Constructor;

public class ConstructorMethods {
	
	/*
	 Regular methods:
	       access-modifier    specifier     return type      method name(parameter) {
	       }
	       
	       
	 Constructor method: It is a very special method.
	     
	     declaration of constructor:                
	       access-modifier    classname() {
	              statements;
	       }
	       
	   => Every single class must have a constructor.
	      If we do not declare one, then compiler will declare the default constructor.
	   => Constructor's name must be same with the class name.
	   => Only a constructor can call another constructor. 
	   => Constructor's execution depends on the creation of the object.   
	 */
	
	public ConstructorMethods() {
		
		System.out.println("Hello World");
		System.out.println("I am a default constructor");
		
		// return "aaa";   there is no return type in constructor
		
	}
	public ConstructorMethods(int num) {
		
		System.out.println("Hello World");
		System.out.println("I am a constructor with an argument of int: "+num);
	}
	
	public static void main(String[] args) {
	//	ConstructorMethods obj = new ConstructorMethods("A");
		     // object was not created with the existing constructor.
		
		ConstructorMethods obj2 = new ConstructorMethods();
		
	}

}
