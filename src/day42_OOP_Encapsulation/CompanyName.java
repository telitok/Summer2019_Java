package day42_OOP_Encapsulation;

public class CompanyName {
	
	public static void main(String[] args) {
		
		EmployeeInfo tugba = new EmployeeInfo();
		// tugba.Name = "Tugba";  // private data is not visible outside the class.
		
		tugba.setName("Tugba");
		System.out.println(tugba.getName());
		
		tugba.setSSN(1234);  // assigning 1234 to SSN
		System.out.println(tugba.getSSN());
		
		tugba.setAge((byte)32);
		System.out.println(tugba.getAge());
		
		tugba.setSalary(120000);
		System.out.println(tugba.getSalary());
		
		System.out.println("===================================");
		
		EmployeeInfo Shirin = new EmployeeInfo();
		Shirin.setName("Shirin");
		Shirin.setSSN(777777);
		Shirin.setAge((byte)20);
		Shirin.setSalary(100000);
		
		System.out.println(Shirin.getName());
		System.out.println(Shirin.getSSN());
		System.out.println(Shirin.getAge());
		System.out.println(Shirin.getSalary());
		
		EmployeeInfo Harun = new EmployeeInfo();
		Harun.setInfo("Harun", 98765432, (byte)31, 140000);
		
		System.out.println(Harun.getName());
		System.out.println(Harun.getSSN());
		System.out.println(Harun.getSalary());
	}
	
	

}
