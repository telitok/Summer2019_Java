package day38_CustomClassContiue;

public class Employee {
	
// instance variables	
	String Name;
	String ID;
	int age;
	int SSN;
	String Jobtitle;
	double salary;
	
	         //      local variables
	public Employee(String Name, String ID, int age, int SSN, String Jobtitle, double salary) {
		this.Name = Name;
		this.ID=ID;
		this.age = age;
		this.SSN = SSN;
		this.Jobtitle = Jobtitle;
		this.salary=salary;
	}
	
	
	public void getInfo() {
		System.out.println("Employee name is: "+Name);
		System.out.println("Social security number is: "+SSN);
		System.out.println("Age is: "+age);
		System.out.println("Job title is: "+Jobtitle);
		System.out.println("Employee ID is: "+ID);
		System.out.println("Salary $"+salary);
		
		System.out.println("---------------------------------------------");
		
	}

}
