package day20_JavaRecap;

public class StringMethods {
	
	public static void main(String[] args) {
		
		
		/*
		 subString:
		      used to create a sub value of the String.
		      Ending index is excluded.
		 */
		
		String str = "Cybertek School";  // String literals
		
		str = str.substring(0, str.indexOf("k")+1);
		System.out.println(str);
		
		
		// index of():
		
		String s1 = "Java is a fun Language, I love Java";
		System.out.println(s1.indexOf("a"));
		
		System.out.println(s1.indexOf("ag")); // index num of a in the "language"
		
		
		// lastIndexOf():
		
		System.out.println(s1.lastIndexOf("a"));
		
		System.out.println(s1.indexOf("ava"));
		System.out.println(s1.lastIndexOf("ava"));
	}

}
