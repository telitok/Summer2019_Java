package day59_Exceptions;

import java.util.NoSuchElementException;

public class Multi_Catch_Blocks {
	
	public static void main(String[] args) {
		
	/*
	try {
		System.out.println(9/0);
	}catch (RuntimeException e) {
		System.out.println("Arithmetic exception");
	}catch(ArithmeticException d) {
		
	}
	This would give error, because exception is already solved by the RuntimeException block which is parent of ArithmeticException
*/
		
		int [] arr = {1,2,3};
		
		try {
		System.out.println(arr[100]);
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception");
		}
		catch(ClassCastException e) {
			System.out.println("Class Cast Exception");
		}
		catch (NoSuchElementException e) {
			System.out.println("No such element exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bound Exception");
		}
		
		System.out.println("========================================");
		
		try {
			System.out.println(11/0);
		}catch(ArithmeticException e) {
		    System.out.println("Artihmetic Exception");
		}catch(RuntimeException e) {
			System.out.println("Runtime Exception");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("Hello");
		
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			// code here
			System.out.println("unexpected event occured at line 78");
		}

		System.out.println("World");
		System.out.println("Test completed");
}
}
