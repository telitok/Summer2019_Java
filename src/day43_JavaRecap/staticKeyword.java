package day43_JavaRecap;

public class staticKeyword {
	
	String InsName="Filiz";
	static String StaName = "Nurzat";
	
	public static void printName() {
		//System.out.println(InsName); // gives error, because static accepts only static
		System.out.println(StaName);
	}
	public void printName2() {
		System.out.println(InsName);
		System.out.println(StaName); // class members are always accepted
	}

}
