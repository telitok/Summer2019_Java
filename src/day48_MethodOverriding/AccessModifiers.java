package day48_MethodOverriding;

class Credentials {
	
	private final String UserName = "cybertek";
	private final String Password = "Batch12";
	
	public void setUserName(String UserName) {
		//this.UserName = UserName;   => gives compile error
		// we cannot use setter for final variables
	}
	
}

class Mahribana {
	
	void methodA() {
		// the method we will override must be inheritable to the sub class.
		System.out.println("Method A");
	}
	public String methodB() {
		return"B";
		}
	
	protected double salary(double bonus) {
		return bonus+100000;
	}
}

public class AccessModifiers extends Mahribana{
	
	public static void main(String[] args) {
		
	}
	
	@Override
	void methodA() {
		System.out.println("Method A");
	}
	
	@Override
	public String methodB() {
		return"C";
		}
	
	@Override
	public double salary(double bonus) {
		return bonus+200000;
	}

}
