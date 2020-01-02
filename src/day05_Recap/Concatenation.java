package day05_Recap;

public class Concatenation {
	/*
	 String: represents the sequences of characters, used for storing text
	         String values are surrendered by by a double quote
	         
	 Concatenation: combining, linking things together  ==> creates a string value
	                we can concat any value to String
	 */
	
	public static void main(String[] args) {
	
		
		String str = "any text goes here";
		System.out.println(str);
		
		String str2 = "1";
		System.out.println(str2);
		
		System.out.println("Hello World");
		
		String Hello = "Hello World";
		System.out.println(Hello);
		
		
		String myName = "Cybertek" + " School";
		System.out.println(myName);
		
		String Year = "This is " + 2019;
		System.out.println(Year);
		
   // Example:
		String name = "Tugba";
		System.out.println("My Name is "+name);
		
		/*
		 cucumber is variable $
		 Tomato is variablename $
		 */
		
		int cucumber = 3;   int tomato = 5;
		
		System.out.println("cucumber is "+"$"+cucumber);  // "cucumber is $3"
		System.out.println("Tomato is "+"$"+tomato);      //  "Tomato is $5"
		
		String newStr = "100"+10;
		System.out.println(newStr);   // 10010
		
		System.out.println( 1 + 2 + 3 );  // 6
		
		System.out.println("1"+2+3);   // "12"+3  ==> 123
		
		// System.out.println("1"+1-3);  //  "11"-3
		
		System.out.println("Batch 12"+1+2);  // "Batch 121"+2  ==> batch 1212
		
		System.out.println(2-1+1+"4");  // 1+1+"4" = 2+"4" => 24
		
		  System.out.println( "Batch 12" + (1+2) );
		  //                  "Batch 12" +   3  ==> Batch 123
		  
		  System.out.println(1 + "123" + 4 + 5 );  // 112345
		  
		  System.out.println("123" + (4+5));   // 1239
		  
		  System.out.println(1+ ("1"+2));  // 112
		  
		  System.out.println(1+"123"+(4+5)); // 11239
		  
		  System.out.println(4+3- (9+3)); 
		  //                 7  -  12     = -5
		  
		  System.out.println((1+2)+"3");   //33
		  
		//  System.out.println((1+2) - "3");
		  //                   3 - "3"   ==> this means number minus text which does not make sense, so it will not compile.
		  
		  String BookName = "I like the book called \' Game of Thrones \'";
		  System.out.println(BookName);
		
		  String MyInfo = "My name is: \n\tCybertek";
		  System.out.println(MyInfo);
		  
		  
		  System.out.println('3' + 3);  //54
		  //                  51 +3 = 54     ==> single quote makes it a char value which takes values from the ASCII table. 3 on the ASCII table represents 51.
		  
		  System.out.println("3"+3);  // 33
		  
		  System.out.println("3"+'3');   //  if we concat char to String, char is concated as character itself, so as '3' will be added as 3.
		  //                 "3"+3 = 33
		   
		  System.out.println(12+'3');  // if we concat char to a number, representive number of char will be concated.
		  //                 12 + 51 = 63
		  
		  
		  System.out.println(2+3);  //5
		  System.out.println("2"+3);  // 23
		  
		  
		  System.out.println("2"+3);  // 23
		  
		  System.out.println('7'+3);
		  //                  55+3 = 58
		  
		  System.out.println('7'+9);
		  //                  55+9 = 64
		  
	}

}
