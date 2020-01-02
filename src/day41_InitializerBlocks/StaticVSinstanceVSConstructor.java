package day41_InitializerBlocks;

public class StaticVSinstanceVSConstructor {
	
	static {
		System.out.println("static block");
		// static block execution does not depend on the object
		  // executed as soos as the class is loaded, Only ONCE
	}
	{
		System.out.println("instance block");
		// instance block execution depends on the object
		// when object is created, constructor runs after the instance block
	}
	public StaticVSinstanceVSConstructor() {
		System.out.println("Constructor");
		// // instance block execution depends on the object
		// when object is created, constructor runs after the instance block
	}
	
	public static void main(String[] args) {
		
		StaticVSinstanceVSConstructor obj = new StaticVSinstanceVSConstructor();
		StaticVSinstanceVSConstructor obj2 = new StaticVSinstanceVSConstructor();
		
		// constructor and instance block execution depends on the creation of the object
	}
}
