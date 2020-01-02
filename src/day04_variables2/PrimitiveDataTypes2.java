package day04_variables2;

public class PrimitiveDataTypes2 {
	
	
/*
 Primitives: byte, short, int, long, float, double, boolean, char
 
    boolean: takes all boolean expressions and returns as either true or false
    (True or false expressions). Anything that can return either true or false, can be initialized to boolean.
     
    char: declared within the single quote ' '; single character only.
          ' ' is a must when you give character as value
 */
	
	public static void main(String[] args) {
		
		// boolean result4 = Earth is flat;   this does not work, java takes only logical operators. 
		// boolean num1 = 100; boolean only takes true or false expressions
		
		boolean result = true;
		boolean result2 = false; 
		boolean result3 = 9 > 3;
		
		System.out.println(result);  //true
		System.out.println(result2);   // false
		System.out.println(result3);  // true
		
		
		// char:
		char char1 = 'a';
		
		System.out.println(char1);
		
		// char char2 = 'ab';   you can only give a single character
		
		char char2 = '9';
		char char3 = '#';
		System.out.println("\n\n");
		
		// Welcome  ==> emocleW  a scenario to use char
		// char with numbers
		char char4 = 67;  // only time we use '' for char is when we are declaring single characters.
		
		System.out.println(char4);   // char takes values only from the ASCII table. 67 = C on the ASCII table.
		
		
		char char5 = 'C';  // prints the character as C
		System.out.println(char5);
		
		char char6 = '{';
		char char7 = 123;
		
		System.out.println(char6);
		System.out.println(char7);  // prints the character that has the number of 123 from ASCII table
		
		
		// initializing char to other primitives: byte, short, int, long, float, and double
		     char   MyChar1       =    'b';
		     //   variable name       value
		     
		     int MyInt = 'b';  // the number that represents b is initialized to the int
		     
		     // (int MyInt = MyChar1; )
		     
		     System.out.println(MyInt);   // it prints 98
		     
		     
		    // byte MyByte = MyChar1 ; // char takes 2 bytes of memory, byte memory is 1 byte
		       byte MyByte2 = 'b'; // b's corresponding number is 98
		       
		       System.out.println(MyByte2);
		       
		    //   short ShortNum = MyChar1;   // char's memory could be bigger than short, and its range is greater than short
		         short ShortNum2 = 'b';   // this compiles. b's corresponding number is 98 on the ASCII table which is within the range of short and char.
		         System.out.println(ShortNum2);
		         
		         
		         long LongNum = MyChar1; // long's memory is 8 bytes
		         long LongNum2 = 'b'; // because corresponding number b is 98.
		         System.out.println(LongNum);
		         
		         float floatNum = MyChar1;
		         float floatNum2 = 'b';
		         System.out.println(floatNum2);
		         
		         
		         double doubleNum = MyChar1;
		         double doubleNum2 = 'b';
		         System.out.println(doubleNum);  // prints 98.0
		         System.out.println(doubleNum2);
		         
		         // Java is case sensitive: A does not equal to a
		         
		         
		         char mycharValue = 1987;   // ASCII table has only 127 characters. This is out of ASCII, so whatever shows up is not a character from the ASCII table. 
		         System.out.println(mycharValue);   // ASCII table is recognized by all computers.
		         
		         
		
	}

}
