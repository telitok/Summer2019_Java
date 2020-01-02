package day45_Inheritance;

class Data{
	public String name;
	private String age;
	String ID;
	
	public void Hello() {  // public instance method
		System.out.println("Hello");
		
	}
	private void Hola() {  // private instance method
		System.out.println("Hola");
		
	}
	void Aloha() {  // default instance method
		System.out.println("Aloha");
		
	}
}

public class MultiClassPractice {
	
	public static void main(String[] args) {
		Data obj = new Data();
		System.out.println(obj.name); // public, it is visible everywhere
		// System.out.println(obj.age); // private, not visible outside the class
		System.out.println(obj.ID);  // default,visible to classes in the same package
	
	/* 
	 if those two classes were located in two different packages,
	 then the default access modifier will not be visible.
	 */
	
		obj.Hello();
		// obj.Hola();  // gives error, bacause it is private
		obj.Aloha();
		
	}

}
