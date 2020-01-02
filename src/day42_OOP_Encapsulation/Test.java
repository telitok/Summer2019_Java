package day42_OOP_Encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		TestData obj=new TestData();
		//    System.out.println(obj.Name); // the data was private, gives error
		
		System.out.println(obj.getName());
		
		String str = obj.getName();
		
		System.out.println(obj.getID());
		  int a = obj.getID();
		  
	// modify
		//obj.Name = "Nurzat";   we cannot change it this way since it is private. We have to use public method.  
		  obj.setName("Nurzat");
		  
		  // System.out.println(obj.Name);
		  System.out.println(obj.getName());
		  
		  obj.setID(400);
		 // System.out.println(obj.ID);  => it is private
		  System.out.println(obj.getID());
	}

}
