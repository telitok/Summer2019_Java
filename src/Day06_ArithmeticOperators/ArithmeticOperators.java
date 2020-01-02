package Day06_ArithmeticOperators;

public class ArithmeticOperators {
	
	/*
	 + : addition, adds two numbers
	 - : substraction, substracts a number from another number
	 * : multiplication
	 / : division
	 
	 % : remainder. returns the remainder from the division
	 
	 */
	
	public static void main(String[] args) {
		int a = 100;
		int b = a - 400; // -300;
		
		System.out.println(b);
		
		int c = a+b; // 100 + -300 = -200
		System.out.println(c);
		
		
		int X = 3, Y=5, Z= X*Y;
		System.out.println(Z);  // 15
		
		int length = 100, Width= 10, 
				Area= length/Width;
		
		System.out.println(Area);
		
		System.out.println(3 + 5 + 4 - 2);   // 10
		
		//  double resultNum = 9/0;  // denominator cannot be zero. It will give error.
	
	     
		double Number1 = 10/3;    // 3.0
		System.out.println(Number1);
		
		double Number2 = 10/3.0;      // 3. 33333
		System.out.println(Number2);
		
		
		int output = 12+6/3;
		System.out.println(output);   // 14
		
		
		System.out.println(5+2*4);  // 13
		System.out.println(5+4*2);  // 13
		System.out.println(10/2-3);  // 2
		System.out.println(8+12*2);  // 32
		
		
 // %: divides two numbers and returns the remainder  (gives you the remaining number)
		 /*
		    10/3 ==> 3 with remainder of 1
		    12/5 ==> 2 with remainder of ( 12 - (5*2)) = 2
		    20/3 ==> 6 with remainder of 2  ( 20 - 6*3 = 2 )
		  */
		
		int result1 = 10%3;  // 1
		System.out.println(result1);
		
		System.out.println(12%5);  // 2
		
		/*
		 
		 20, 45, 65, 67, 68
		 even number: can be divided by 2 without a remainder
		 odd number: when divided by 2 will have remainder
		 
		 */
		
		int Number20 = 20%2;   // even number
		int Number45 = 45%2;   // odd number
		int Number65 = 65%2;   // odd number
		
		System.out.println(Number20);  // 0
		System.out.println(Number45);  // 1
		
		
		System.out.println(4 + 17 % 2 - 1);   // 17%2 will be calculated first
		
		System.out.println(6 - 3 * 2 + 7 - 1);
		
		System.out.println( 6 * 3 / 2);    // start from the left because it comes first.
		
		
		System.out.println( 1 + 2 - 2 + 3);  // 4
		System.out.println(1 + 2 - (2 + 3) );  // -2
		
		System.out.println(3 + 4 * 4 + 5 * (4 + 3) );
		  //               3 + 4 * 4 +  5  *  7   = 54
		
		
//		%:
		
		// 10/4 ==> 2 with the remainder of 2  (10 - 2*4) = 2
		
		System.out.println( 10%4);  // 2
		
		System.out.println( (4 + 17) % 2 - 1);  // 0
		//                     21 % 2 - 1
		//                         1 -  1  = 0
		
		
		double percentage = 10/100;  // 10%  0.1
		System.out.println(percentage);
	
	}

}
