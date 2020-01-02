package Practice;

public class Quiz_ {
	
	public static void main(String[] args) {
		
		
		String str = " ";
		str.trim();
		boolean A = str.isEmpty();
		System.out.println(A);
		
		String ta = "A";
		ta = ta.concat("B");
		String tb = "C";
		ta = ta+tb;
		ta.replace('C', 'D');
		ta=ta+tb;
		System.out.println(ta);
		
		//3
	/*	String str2 = "Hello World";
		str2.trim();
		int z = str2.indexOf(" ");
		System.out.println(z);
		*/
		
		//4
		String str1 = "Java";
		String str2 = new String ("java");
		if(str1==str2){ 
			System.out.println("Equal");
	}else {
		System.out.println("Not equal");
	}
		String str3= "Batch 12";
		int Z = str3.trim().length();
		System.out.println(Z);
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:"+ s1==s2);
	}
	

}
