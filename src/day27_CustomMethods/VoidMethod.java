package day27_CustomMethods;

public class VoidMethod {
	
	/*
	     Void method method is the method does not return any value
	     
	     declaration of method:
	     access-modifier   specifier   return-type    methodname() {
	         statements;
	         }
	 */
	
	public static void main(String[] args) {
		
		// method is grouping a series of statements to perform a specific task
		
		myFirstMethod();
		even1to100();
	
	}
	
	public static void even1to100() {
		for (int i = 0; i<100; i++) {
			if (i%2 !=0) {
				continue;
			}
			System.out.println(i+" ");
		}
		
	}
	
	public static void myFirstMethod() {
		
	//	public static void main(String [] ) {
		   // methods must be declared within the class
		
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Tugba");
	}

}

