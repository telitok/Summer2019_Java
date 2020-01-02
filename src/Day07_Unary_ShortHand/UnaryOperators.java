package Day07_Unary_ShortHand;

public class UnaryOperators {

	public static void main(String[] args) {
		
		System.out.println(12.8/3L);   // 4.266666...  So the result is decimal beacuse there is decimal number in the question.
		System.out.println(10.5 % 3);  // 1.5     the result is as decimal number again.
	
	/*
	 + : positive
	 - : negative
	 ++ : increment : increases the value by 1.
	 -- : decrement : decreases the value by 1.
	 
	 There is two types of increment:
	   1. pre increment: increases the value by 1 immediately.
	   2. post increment
	   
	 There are two types of decrement:
	   1. Pre decrement: operator is placed before the variable.
	                     It decreases the value by 1 IMMEDIATELY.
	   2. Post decrement : operator is placed after the variable. 
	                       It does NOT decrease the value immediately. Decreases in the next step.
	 
 for + & - :
	 + - ===> -
	 - - ===> +
	 + + ===> +
	  
	 */
		
		int a = 10;
		int b = -a;
		System.out.println(b);
		
		int c = +b;  // + (-10) ==> -10
		System.out.println(c);
		
		int d = -c; // - (-10) = +10
		System.out.println(d);
		
		int f = - (10);
		System.out.println(f);
		
	// increment:
         // pre increment: operator is placed before the variable;
		
		   int num1 = 100;
		   
		   System.out.println(++num1);   // num1+1 = 101
		   
		   int num2 = ++num1;  // ++(101) = 102
		   System.out.println(num2);
		   
		   
		   // post increment: operator is placed after the variable. Does NOT increase the value by 1 immediately.
		   
		       int IntNum = 100;
		       
		       System.out.println(IntNum++);   // 100 , will be increased in the next step.
		       System.out.println(IntNum);    // 101
		       
		       
		       int IntNum2 = IntNum ++;   // IntNum2 = 101 first
		       System.out.println(IntNum2);  // 101
		       System.out.println(IntNum);  // 102   , increased in the second print.
		       
		       
		       int x = 100;
		       int y = x++ - 1;
		       //  y = 100 -1;
		       System.out.println(y);   // 99   , because it was not increased yet. So 100 -1 = 99
		       
		       
	 // decrement: 
		     // 1. Pre decrement: 
		       
		       int Z = 100;
		         System.out.println(-- Z);  // 99
		         
		         
		     // 2. Post decrement: 
		         
		         int Y = 95;
		         
		         System.out.println(Y--);  // still 95
		         System.out.println(Y);   // now 94
		         
		         
		         int T = 25;
		         System.out.println(++T);  // 26
		         System.out.println(-- T);  // 25  , because 25 was increased to 26 in the previous line, so 26 - 1 = 25.
		         
		         
		         int P = 50;
		         P= --P + P++ + P-- + P ++;
		       //   pre  post   post  post
		       //   49 +  49  + 50  +  49  = 197
		         
		         System.out.println(P);  // 197
		         System.out.println(++P);  // 198
		         
		         
		         
		         short S = 4;
		         int R = S * 4 - S--;
		         //         16    -   4   = 12
		         
		         System.out.println(R);  // 12
		         System.out.println(S);  // 3
		         
		         
		         int W = 1;
		         W = -W-- + W++ / -W-- * --W;
		        //   post   post   post  pre
		        //  - 1   +  0   /  -1  * -1
		        //  -1 + 0 * -1
		        // -1 + 0
		        // -1
		         
		         System.out.println(W);  // -1
		         
		         
		         
		         
	
	}

}
