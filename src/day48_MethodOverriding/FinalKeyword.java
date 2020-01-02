package day48_MethodOverriding;

class Holly {
	final public void printName() {
		System.out.println("Erhan");
	}
}

public class FinalKeyword extends Holly {
	
	/*
	@Override
	public void printName() {
		System.out.println("Madina");
	}
	Final methods cannot be override
	*/
	int AGE;
	
	public static void main(String[] args) {
		
		final String SSN = "1234576";
		// SSN = "88757846";   gives compile error
		// final variables are constant and cannot be changed
		System.out.println(SSN);
		
		final String DateOfBirth;
		
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.AGE);
	}
	public final static void add (int a, int b) {
		System.out.println(a+b);
	}
	public static double add(double x, double y) {
		return x+y;
	}

}
