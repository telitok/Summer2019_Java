package day30_WrapperClass_ArrayList;

import java.util.Arrays;

public class WrapperClasses {
	
	/*
	 Primitives:           Classes:
	 byte                   Byte           null
	 short   Auto-boxing    Short
	 int      ========>     Integer        null
	 long                   Long           null
	 float     Un-boxing    Float
	 double    <========    Double
	 boolean                Boolean
	 char                   Character
	 
	 Default value of primitives:
	 byte, short, int, long ==> 0;
	 double, float ==> 0.0;
	 boolean ==> false
	 char ==> space
	 
	 Default value of wrapper classes ==> null
	 
	 If we do not give any object to class ( reference ) null will be given as default.
	 
	 String's default value is also null.
	 
	 
	 */
	
	public static void main(String[] args) {
		
		int numInt = 10;
		Integer numInteger = 10;
		
		double numdouble=5.5;
		Double NumDouble = 5.5;
		
		long numlong = 20L;
		Long numLong = numlong;  // Auto-Boxing: converting primitive values to Wrapper Class
		
		System.out.println(numlong);
		System.out.println(numLong);
		
		Boolean BooleanResult = false;
		boolean booleanResult = BooleanResult; // unboxing
		
		char ch1 = 'L';
		Character ch2=ch1;  // Auto-boxing
		
		char ch3 = ch1;  // none
		
		char ch4 = ch2;   // un-boxing
		
		Character ch5 = ch2;  // none
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		
		Long [] arr = new Long[3];   // [0,0,0]
		System.out.println(Arrays.toString(arr));
		
		int num1=10;
		// num1.method(); primitives do not have methods, variable num1 is not a reference of an object.
		
		Integer num2 = 20;
		int x = num2.MAX_VALUE;
		
		
	}

}
