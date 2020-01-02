package day05_Recap;



public class Primitives_Review {
	
	/*
	 Primitives:
	      byte: only takes whole numbers
	      short: only takes whole numbers
	      int: only takes whole numbers  (used more often)
	      long: only takes whole numbers
	      
	      float: can take decimals (MUST have F or f at the end)
	      double: can take decimals
	      
	      boolean: true or false boolean expressions
	      char: character within single quote   (prints from the ASCII table)
	            also takes numbers
	
	Range: double> float > long > int > short > byte
	
	 */

	public static void main(String[] args) {
		
		byte bNum = 127;  // gives error, because byte ranges from -128 to 127
		
		System.out.println(bNum);
		// java applications are read from top to the bottom
		
		// byte bNum2 = 126.5;  // gives error because byte takes only whole numbers
		
   // short:
		
		short sNum2 = 1000;
		// short sNum = 126.5;  // gives error because short takes only whole numbers
		
		// bNum = sNum2 // short is greater than byte
		
		sNum2 = bNum;  // sNum2 = 127;
		System.out.println(sNum2);
		
		short sNum3 = 127;
		// byte bNum5 = sNum3;  // short > byte
		
		int intNum = 100;
		// int intNum2 = 100.5; // gives error because int accepts whole numbers only
		
		System.out.println(intNum);  // prints 100
		
		// byte ByteNum = intNum; // int > byte
		// short ShortNum = intNum; // int> short
		
		
		short ShortNum2 = 105;
		intNum = ShortNum2;
		
		System.out.println(intNum);  // prints 105, because I just said that intNum is equal to ShortNum2 which 105.
		
	// long:
		
		long LongNum = 100l;
		long LongNum2 = 100L;
		
		
		//  byte ByteNum3 = LongNum;
	    //  short ShortNum4 = 100l;
	    //  int IntNum3 = 100L;           long > int, byte, short
		
		byte a = 10;
		int b = 30;
		short c = 40;
		
		long LongNumber = a;
		long LongNumber2 = b;
		long LongNumber3 = c;
		
		
	// float:
		
		   float floatNumber = 10.5f;
		   float floatNumber2 = 20.5F;
		   
		   short a1 = 10;  byte b1 = 20;  long c1 = 30;   int d1 = 40;
		   
		   float Floats = a1;
		   float Floats2 = b1;
		   float Floats3 = c1;
		   float Floats4 = d1;
		   
		   System.out.println(Floats);
		   
		   
	// double: takes all the types of primitives, whole and decimal numbers
		   double DoubleNum1 = 10L;  // long is smaller than double
		   
		   double DoubleNum2 = 10.5f;
		 
		   
    // boolean:
		   boolean result = true;
		   boolean result2 = false;
		   
		   boolean result3 = 9 > 10;
		   
	// char: 
		   char character1 = 'A';
		   System.out.println(character1);  // character: A
		   
		  //  char character2 = A;
		   
		  // char character3 = 'AA';     gives a compile error because it needs to be a single character
		 
		  
		   // all the characters have a representative number:
		   
		   char charvalue = 98;
		   System.out.println(charvalue);   // 98 is a representative number for b on the ASCII table
		   
		   
		   int num3 = 'B';
		   System.out.println(num3);  // it prints 66 because it represents B on the ASCII table
		   
		   float fnum = 'B';
		   System.out.println(fnum);  // prints 66.0 because float is for decimal numbers
		   
		   
		  byte bValue = 'B';
		  System.out.println(bValue);   // it prints 66
		  
		  
	// float:
		  float fnum2 = 5.5F;
		  float fnum3 = 5;   // it will be printed as 5.0
		  
		  
		  char specialcharacters = 55000;
		  System.out.println(specialcharacters);
		   
		   
		   // practices : 
		  
		  /*
		   8,    9,    #,     @,   8.5,    5.5F
		   
		   128,    40000,   9 > 10,   true,   false 
		    
		   */
		 
		    //8:
		  byte Bnum = 8;    short SNum = 8;   int INum = 8;
		  long LNum = 8;    float FNum = 8;   double DNum = 8;
		  char character = '8';
		   
		   System.out.println(Bnum);  //8
		   System.out.println(SNum);    //8
		   System.out.println(INum);   //8
		   System.out.println(LNum);    //8
		   
		   System.out.println(FNum);   // 8.0
		   System.out.println(DNum);   // 8.0
		   System.out.println(character);  //8
		   
		   // # & @ :
		      char character2 = '#';
		      char character3 = '@';
		      System.out.println(character2);
		      System.out.println(character3);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		
		
		
		
		
	}
}
