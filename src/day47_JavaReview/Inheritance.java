package day47_JavaReview;

class A{
	
	public String name1 = "Ayaz";
	
}

class B extends A{
	
	public String name2 = "Sukran";
	public String name3 = "Erhan";
	
	public void method1() {
		super.name1 = "Feride";
	}

}

public class Inheritance extends B {  // there are 5 instance variables in this class due to inheritance
	
	public String name4 = "Mehmet";
	public String name5 = "Mahribana";
	
	public static void main(String[] args) {
		
		Inheritance obj = new Inheritance();  // we have to create an object to call instance variables.
	                                        // because main method is static, and static method cannot call instance variables.
	   System.out.println(obj.name1);
	   System.out.println(obj.name2);
	   System.out.println(obj.name3);
	   System.out.println(obj.name4);
	   System.out.println(obj.name5);
	   
	   B obj2 = new B();
	   
	   System.out.println(obj2.name1);
	   System.out.println(obj2.name2);
	   System.out.println(obj2.name3);
	 //  System.out.println(obj2.name4);  // gives error, not belong to B class
	 //  System.out.println(obj2.name5);  // gives error not belong to B class
	
	   A obj3 = new A();
	   
	   System.out.println(obj3.name1);
	  // System.out.println(obj3.name2);
	  // System.out.println(obj3.name3);
	  // System.out.println(obj3.name4);
	  // System.out.println(obj3.name5);
	}

}
