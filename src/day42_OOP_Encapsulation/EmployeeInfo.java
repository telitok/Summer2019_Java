package day42_OOP_Encapsulation;

public class EmployeeInfo {
	
	/*
	 Name
	 SSN
	 Age
	 Salary
	 */
	
	// instance variables, outside of any method
	private String Name;
	private long SSN;
	private byte Age;
	private double Salary;
	
	// name
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {  // instance method
		return Name;
	}
	//ssn
	public long getSSN() {  // to get the data   => instance method
		return SSN;
	}
	public void setSSN(long SSN) {  // to change the data
		this.SSN = SSN;
	}
	// age
	public void setAge(byte Age) {
		this.Age = Age;
	}
	public long getAge() {
		return Age;
	}
	// salary
	public void setSalary (double Salary) {
		this.Salary = Salary;
	}
	public double getSalary () {
		return Salary;
	}
	
	//setInfo
	public void setInfo(String Name, long SSN,byte Age, double Salary) {
		setName(Name);
		setSSN(SSN);
		setAge(Age);
		setSalary(Salary);
		
		
	}

}
