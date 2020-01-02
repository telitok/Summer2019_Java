package Day07_Unary_ShortHand;

public class Quiz_Review {
	
	public static void main(String[] args) {
		
		
		// Question 1:
		
		int a = 30;
		int b = (byte) a;
		System.out.println(b);  // 30
		
		// Question 2: It gives error since a is not defined yet.
		
		// Question 3 :
		
		System.out.print("Result A"+0+1);
		             //   "Result A01"
		
		System.out.print("; Result B" +(1)+(2));
		             //   "; Result B12"
		
		// Question 4: 
		
		System.out.println("5 + 2 =" + 3+4);
		//                 "5 + 2 = 3" + 4
		//                  " 5 + 2 = 34"
		
		System.out.println("5 + 2 = " + (3+4));
		//                 " 5 + 2 = 7"
		
		// Question 5:
		    float FloatNum = 100.98765432f;
		    short ShortNum = (byte) FloatNum;
		    System.out.println(ShortNum);  // 100
		    
		
		// Question 6:
		   // byte a = 200  // gives error because byte cannot have a number larger than 127. byte's max capacity is 127.
		   // int b = 2
		    
		    int Numa = 200;  // we wrote it as int in order to be able to do the math and see the result.
		    int Numb = 2;
		 System.out.println(Numa + Numb - Numa * Numb +Numa / Numb);   // -98
		    
		
		 // Question 7: 
		    System.out.println( (3+2) * 2 / 3 % 2);  // = 1
		    
		    
		 // Question 8:
		    
		   // int num1 = 9, num2 = 0, num3 = num1/num2;  // the denominator cannot be zero, so we get an error message.
		    
		  //  System.out.println(num3);  // gives error message.
		    
		    
		  // Question 9:
		       long Lnum = 3_000L;
		       double Dnum = (float) Lnum;   // narrowing
		       int Inum = (short) Dnum;   // int, short, byte
		       System.out.println(Inum % 1000);
		        //                3000 % 1000 = 0
		       
		       
		  // Question 10:
		       double result1 = 10/3;
		       //     result1 = 3;   ==> 3.0
		       System.out.println(result1);
		       
		  // Question 11:     System.out.println( 10 / 3.0 );   3.3333...
		       
		       
		  // Question 12 :
		       String str = "10.5";  // string of text
		       
		      // int num = (int) str;  // string is not a primitive, that's why it gives a compile error
		       
		 
		  // Question 13:
		       
		       int I1 = 10, I2 = 20, I3 = 30;
		           I1 = I1 % 5;  // 10 % 5 = 0    I1 = 0
		           I2 = I2 % 5;    // 20 % 5 = 0   I2 = 0
		           
		           I3 = I1 * I2;   // I3 = 0
		           
		           System.out.println( I1 + "\t" + I2 + "\t" + I3);   // escape sequences must be written within "".
		 
		    System.out.println( 10 / 3L );   // 3
		    System.out.println( 10 / 3f );   // 3.3333..
		    System.out.println( 10 / 3D );   // 3.3333333...
		    
		    float yy = 10.7f;
		    double uu = 10.9;
		    
		    // float and double both for decimal numbers, however, for float if we give a decimal number we have to add f to the decimal number, for double even the number is decimal number, we do not have to add D.
		    
	}

}
