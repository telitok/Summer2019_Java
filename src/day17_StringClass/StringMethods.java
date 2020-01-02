package day17_StringClass;

import java.util.jar.Attributes.Name;

public class StringMethods {
	
	public static void main(String[] args) {
		
		
		String str1 = "Hello Javengers";
		String str2 = "Hello Javengers";
		boolean R1 = str1 == str2;
		System.out.println(R1);
		
		String str3 = new String("Hello Javengers");
		String str4 = new String("Hello Javengers");
		boolean R2 = str3 == str4; // false
		System.out.println(R2);
		
		boolean R3 = str1 == str3;  // false
		
		System.out.println(R3);
		
		/*
		 Methods:
		 1. concat  2. Length   3. charAt   4. toUppercase
		 5. toLowercase
		 
		 concat(str): it take sString, and combines the two Strings and returns it as new String Value.
		 
		
		 */
		
		String a = "Cybertek";
		a.concat(" School");  // It has not added School to "Cybertek" yet, because String is immutable. We need to create a new String for Cybertek School.
		System.out.println(a);  // a = Cybertek
		a = a.concat(" School");
		System.out.println(a);  // Cybertek School
		
		String A = "hello", B = "hello ";
		System.out.println(A==B); // false, because of the space that B has at the end of "hello "
		
		String C = "Hello", D = "hello";
		System.out.println(C==D); // false, because of case sensitivity
		
		
	/*
	 length():
	 it returns the length (total number of the characters) in the as an int value
	 
	 */
		
		String LongName = "ABCDEFGHIJKLMN";
		int num = LongName.length();
		System.out.println(num);
		
		
  // charAt(indexNum): it returns the character of that index number
		
		String name1 = "Muhtar";
		// index num= 01234567
		
		char ch = name1.charAt(5);
		System.out.println(ch);  // r, index 5 is r
		
		
  /*
   toUpperCase(): converts the String value to upper case and returns it as a new String value.
   
   
   toLowerCase(): converts the String value to lower case and returns it as a new String value.
   */
		
		String name2 = "cybertek";
		name2.toUpperCase();
		System.out.println(name2);  // name2 = cybertek, because String is immutable.
		
		name2 = name2.toUpperCase();
		System.out.println(name2);  // name2 = CYBERTEK, because we gave a new value to name2.
		
		String name3 = "CYBERTEK";
		name3.toLowerCase();
		System.out.println(name3);  // name3 = CYBERTEK
		
		name3 = name3.toLowerCase();
		System.out.println(name3);
		
		
  /*
   trim(): used to remove the unused spaces, and returns a NEW String value.
   
   */
		
		String s1 = "             hello";
		s1.trim();
		System.out.println(s1);  // still with spaces
		
		s1 = s1.trim();
		System.out.println(s1);  // without any spaces
		
		String s2 = "Cybertek      School";
		s2.trim();
		System.out.println(s2);
		
		s2 = s2.trim();  // if the unused spaces are between the words, spaces will not be removed.
		System.out.println(s2);
		
		String s3 = "   ";
		s3.trim();
		System.out.println(s3);
		
		s3 = s3.trim();
		System.out.println(s3);
		
		String s4 = "    Cybertek     School    ";
		s4.trim();
		System.out.println(s4);
		
		s4 = s4.trim();
		System.out.println(s4);   // the spaces at the beginning and at the end are removed.
	
	
		
	/*
	 substring(beginning index): it creates the sub value of the String from the beginning index till the last index and
	  returns it as a new String value.
	 
	 */
		
		
		String Str = "Cybertek School";
		//            0123456789
		
		Str = Str.substring(9);  // School
		System.out.println(Str);
		
		String address = "McLean VA 22000";
		//            //  0123456789...
		String zipcode = address.substring(10);
		System.out.println(zipcode);
		
		
	/*
	 substring(beginning index, ending index):    	very important!!!
	    
	    it creates the sub value of the String from the beginning index till the ending index (ending index num will be excluded)
	    then it returns it as a new String value.
	 */
	
		
		String Name = "Hello Cybertek School";
		//             0123456789...
	//	NAMe.substring(beginIndex, endIndex);
		
		Name = Name.substring(6, 14);  // the index number of k in Cybertek is 13, however, since substring excludes the last index it prints Cyberte.
		                               // That's why we write the index number of the next letter after k to make sure k is printed as well.
		System.out.println(Name);
		
		
		String fullname = "Cybertek School Batch12";
		
		String middlename = fullname.substring(9, 14+1);  // School
		System.out.println(middlename);
		
		
	
	}

}
