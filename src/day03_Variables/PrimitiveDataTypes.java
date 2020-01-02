package day03_Variables;

public class PrimitiveDataTypes {
	
	private static long intNumber2;

	/*
	 byte: we can assign integers that's no decimal. We can assign numbers -128<= and byte <=127 must be within this range
	 shorts: we can assign only whole numbers. Must be within -32768<= short <= 32767 
	 int (used more often):  we can assign only whole numbers.  Must be within a specific range. -- take a look of the notes for the range
	 long : we can assign only whole number. Must be within a specific range
	 
	 byte<short<int<long
	 small one can be assigned to larger one
	 
	 float: we can assign decimals. (decimals must have f or F letter at the end)
	 double (used more often) : we can assign decimals
	 
	     float < double
	     
	     *byte, short, int, and long can be assigned to float and/or double. Because float and double can accept whole numbers as well.
	 */
	
	
	public static void main(String[] args) {
		
		
		byte length = 3;
		System.out.println(length);
		
		byte width = 4;   // This is how to declare a variable
		
	System.out.println(width);   // Variable names must start with a~z or A~Z
	
	byte num_and$ = 90;
			
			// byte mynum1 = -129 out of byte's range
			// byte public = 10;   byte names cannot be java reserved names. "public" is a java reserved name, however, "Public" is not due to capital letter.
		
			short mynum = 100;
			
			int num4 = -100000;
			// 100,000,000 comas will not be accepted by java
			
			int num5 = 100_000_000;  // easier to read, undersquare is accepted as coma
			
			long longNumber = 10L;   // when we put an "L" that means this data can be assigned to long only.
	        long intNumber = 100l;    // if we add "L" at the end of int value, it will not be accepted.
	
	        
	        byte byteNumber = 10;
	        short shortNumber = byteNumber;
	        
	        short shortNumber2 = 18;
	        short bytenumber2 = shortNumber2; 
	        // byte bytenumber2 = shortNumber2; short is greater than byte
	        
	        
	        int intNumber1 = -19876;
	        long longNumber2 = intNumber2;  // long is greater than int
	        // left side of the = has to be equal or greater than the right side
	        
	        short shortNumber3 = -30000;
	        short shortNumber4 = shortNumber3;
	        System.out.println(shortNumber4);
	        
	       // int exampleNum1 = 10.5; 
	        float examplenum2 = 10.5f;  // we need to give this "f" letter so it will be recognized as decimals
	        float examplenum3 = 20.5f;
	        
	        double doubleNumber = 10.5;   // no letters needs to be added at the end to make it accepted/recognized as decimal.
	        
	        
	        double doubleNumber2 = 30.5;
	     //   float floatNumber = doubleNumber2;    duble data type is larger than float data type
	
	        System.out.println("=================");
	
	        byte bNum = 10;
	        short sNum = 20;
	        int iNum = 30;
	        long lNum = 40;
	        System.out.println(bNum);
	        System.out.println(sNum);
	        System.out.println(iNum);
	        System.out.println(lNum);
	        
	        System.out.println("============");
	        
	        float fNum = bNum;
	        float fNum2 = sNum;
	        float fNum3 = iNum;
	        float fNum4 = lNum;
	        
	        System.out.println(fNum);
	        System.out.println(fNum2);
	        System.out.println(fNum3);
	        System.out.println(fNum4);
	        
	        
	        System.out.println("==============");
	        double dNum = bNum;
	        double dNum2 = sNum;
	        double dNum3 = iNum;
	        double dNum4 = lNum;
	        System.out.println(dNum);
	        System.out.println(dNum2);
	        System.out.println(dNum3);
	        System.out.println(dNum4);
	        
	}

}
