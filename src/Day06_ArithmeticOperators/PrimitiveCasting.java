package Day06_ArithmeticOperators;

public class PrimitiveCasting {
	
    /*
     casting: converting larger primitive to  smaller size.
              datatype variablename = (datatype) value
     
     two types of casting: Explicit & implicit
     Explicit: it is used when we are converting from larger to smaller.Done manually.
     
          Ex: int a= 10
              byte b = (byte) a;
                  
     Implicit: it is used when we are converting from smaller to larger. Done by computer automatically.
          
          Ex: byte a = 10;
              int b = a;    automatically casts.
              
              
     primitives: byte, short, int, long, float, double
     
     */
	
	public static void main(String[] args) {
		int a = 10;
		byte b = (byte) a;  // explicit casting
		
	System.out.println(b);
	
	double DecimalNumber = 10.5;
	// float FloatNumber = DecimalNumber;  // double > float
	
	float FloatNumber = (float) DecimalNumber;
	System.out.println(FloatNumber);
	
	long LongNum = 300L;
	
	//   int IntNum = (int) LongNum;
	int IntNum = (short) LongNum;
	
	System.out.println(IntNum);
	
	
	// Implicit casting:
	
	     byte ByteNum = 100;
	     int IntNum2 = ByteNum;
	     
	     int IntNum3 = (int) ByteNum;   // Even we do not put (int), the compiler will automaticall add it.
	     
	   short ShortNum = 100;
	   long LongNum2 = ShortNum;
	        // same with:
	   long LongNum3 = (long) ShortNum;
	   
	   
	 // explicit casting practices:
	       double LargestNumber = 100.8765;
	       
	       byte ByteValue = (byte) LargestNumber;
	       //                       100       Since byte accepts only whole numbers, the decimal point and numbers after it will be terminated.
	       
	       float FloatValue = (float) LargestNumber;
	       //                         100.8765
	       
	       float FloatValue2 = (int) LargestNumber;
	       float FloatValue3 = (byte) LargestNumber;
	       //                          100.0
	       
	       float FloatValue4 = (short) LargestNumber;
	       float FloatValue5 = (long) LargestNumber;
	       
	       System.out.println(FloatValue);  // 100.8765
	       
	       float FloatNumber2 = 500.67F;
	       
	       int myNumber = (short) FloatNumber2;
	       //                     500
	       System.out.println(myNumber);  // 500
	       
	       
	   /*
	       int  Num1 = 100
	       int Num2 = 200
	       int Num3 = 300
	   */
	       int Num1 = 100, Num2 = 200, Num3= 300;   // it is the same with the above. Instead of writing one by one we write it on the same line with a coma.
		
	       System.out.println(Num1 +"\t"+Num2+"\t"+Num3);
	       
	       
	       // Local Variables: variables are declared within the method.
	       
	      // LOCAL VARIABLES MUST BE DEFINED BEFORE BEING USED!!!
	       
	       
	       boolean result;
	     //  System.out.println(result);   local variables must be initialized.
	       
	       char Character1 = 'A';
	    		   System.out.println(Character1);
	    		   
	  //    boolean result1, result 2, result 3;
	       
	   //  System.out.println(result1);
	       
	       
	       
	}
 
}
