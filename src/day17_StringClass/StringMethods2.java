package day17_StringClass;

public class StringMethods2 {
	
	public static void main(String[] args) {
		
		
		/*
		 replace(old char, new char):    (for a single character)
		               replaces all the old char values with the given new char value
		               and returns it as a new String value.
		 */
		
		String str1 = "Java is fun programming language";
		str1 = str1.replace('a', 'e');
		System.out.println(str1);
		
	/*
	 replace(old str, new str):    (for a whole word)
	     replace all the old str values with the given new str values in the String
	     and returns it as anew value.
	 */
		
		String str2 = "Today is going to be a great day to learn java";
		str2 = str2.replace("Today", "Tomorrow");
		System.out.println(str2);
		
		str2 = str2.replace("java", "");
		System.out.println(str2);
		
		
	/*
	 replaceFirst(old str, new str):
	        it replaces the first occured old str with the new str in the String and returns it as
	        a new String value.
	 */
		
		String s1 = "Java is fun, Java is good";
		s1 = s1.replaceFirst("Java", "Python");
		System.out.println(s1);
		
		s1 = s1.replace('s', 'S');
		s1 = s1.replace('g', 'G');
		System.out.println(s1);
		
		s1 = s1.replace("is good", "iS Good");
		System.out.println(s1);
		
		String s2 = "Java is programming language, Java is Java";
		s2 = s2.replace("Java", "C#");
		System.out.println(s2);
	}

}
