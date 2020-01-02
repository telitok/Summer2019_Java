package day30_WrapperClass_ArrayList;

public class WrapperClassMethods {
	
	public static void main(String[] args) {
		
	
	// max value: returns the maximum value of the primitive   (max number in the range of int)
	int maximum = Integer.MAX_VALUE;
	
	System.out.println(maximum);
	
	double maximumDouble= Double.MAX_VALUE;
	System.out.println(maximumDouble);
	
	byte maximumByte = Byte.MAX_VALUE;
	System.out.println(maximumByte);
	
	char maximumChar = Character.MAX_VALUE;
	System.out.println(maximumChar);
	
	char ch = 1234;
	System.out.println(ch);
	
	
	// min_value: returns the minimum value of the primitive
	
	int minimum = Integer.MIN_VALUE;
	System.out.println(minimum);
	
	byte minimumByte = Byte.MIN_VALUE;
	System.out.println(minimumByte);   // -128  (The lowest number in the range of byte)
	
	
	// parse method: used to convert string values to primitives
	
	// parseInt("stringvalue"): takes the string and converts it to primitive
	
	Integer num1=Integer.parseInt("123");
	System.out.println(num1+1);
	
	int num2 = Integer.parseInt("125");
	System.out.println(num2);
	
	// parseByte ("strValue") : takes the string and converts it to byte value.
	
	// byte num3 = Byte.parseByte("198");  // out of range
	
	byte num3 = Byte.parseByte("18");  //  none
	System.out.println(num3);
	
	Byte num4 = Byte.parseByte("18");  // auto-boxing
	System.out.println(num4+1);
	
	
	//  parseShort ("strValue"): takes the string and converts it to short value.
	
	Short num5=Short.parseShort("200");
	System.out.println(num5);
	
	Short num6=Short.parseShort("200");  // auto-boxing
	System.out.println(num6);
	
	
	// parseLong("strValue"): takes the string value and converts it to long primitive value.
	
	int num7= (int)Long.parseLong("1222");
	long num8 = Long.parseLong("1222");
	System.out.println(num7);
	System.out.println(num8);
	
	
	// parseFloat("strValue"): takes the string value and converts it to float primitive
	
	float num9=Float.parseFloat("12.5f");
	System.out.println(num9);
	
	Float num10 = Float.parseFloat("12.5f");  // Auto-boxing
	System.out.println(num10+1);
	
	
	// parseDouble("StrValue"): takes string value and converts it to double primitive
    
    float num11 = (int)Double.parseDouble("8.5");  // none
    System.out.println(num11);
    
	  double num12 = Double.parseDouble("8.5");
	  System.out.println( num12 );
	  
	  Double num13 = Double.parseDouble("8.5");  // auto-boxing
	  System.out.println(num12);
	      
	      
	// parseBoolean("StrValue"): takes string value and converts to boolean primitive
		
	
	boolean A=Boolean.parseBoolean("CybertekBatch12");
	          // any string values other than true will return false
	
	System.out.println(A);
	
	boolean B=Boolean.parseBoolean("TrUe");  // method ignores the case sensitivity
	System.out.println(B);
	
	boolean C = Boolean.parseBoolean("10>9");
	System.out.println(C);
	
	Boolean D=Boolean.parseBoolean("TrUe");
	System.out.println(D);
	
	
	//==========================================
	
	int a=10;
	double b=a;
	
	//Double c=a;   // Double wrapper class is only dedicated to double primitive
	
	int A1= Byte.parseByte("19");
	Integer A2= (int) Byte.parseByte("19");
	
	Short A3=(short)Double.parseDouble("10.9");
	
	int A5=100;
	Float A6=(float)A5;  // Float wrapper is only dedicated to flat primitive
	
	
	
	// ValueOf methods: converts String value to Wrapper class values.
	
	int z = Integer.valueOf("1234");  // unboxing
	Integer z1=Integer.valueOf("1234");
	
	Integer z2=(int)Integer.valueOf("1215"+3); // 12153      auto-boxing
	
	System.out.println(z2);
	
	
	boolean result1=Boolean.valueOf("TRUE");  // unboxing
	System.out.println(result1);  // valuesOf methods ignores the case sensitivity
	
	
	int totalnumber=100;
	String str3=""+totalnumber;
	System.out.println(str3);
	
	
	
	}	

}
