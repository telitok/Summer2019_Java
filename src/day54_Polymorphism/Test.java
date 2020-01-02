package day54_Polymorphism;

abstract class AbstractClass{
	
	public static void ByLinkText() {
		System.out.println("Link text super");
	}
	
	public void get() {
		System.out.println("Chrome");
	}
	
}

public class Test extends AbstractClass {
	
	public void get() {
		System.out.println("Firefox");
	}
	
	public static void ByLinkText(int a) {  // not overridden method, because it is static. Only instance method can be overridden
		System.out.println("Link text sub");
	}
	
	public static void Test() {
		
	}
	
	public static void main(String[] args) {
		
		// AbstractClass obj = new AbstractClass();    we can create object through abstract class, because it is not concrete, it is changeable
		                                            // same with interface, interface is also not concrete, plus it is not a class
		
		AbstractClass obj2 = new Test();
	// reference type            non-abstract class
		obj2.ByLinkText();  // Will print the original method in the Abstract class, because static method cannot be override.
		               //  Prints Link text super
		
		obj2.get();   // the overridden method will be printed ==> Firefox
		
		Test obj3  = new Test();
		obj3.ByLinkText(10);
		
		
	}

}
