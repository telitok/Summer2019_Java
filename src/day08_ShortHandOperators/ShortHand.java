package day08_ShortHandOperators;

public class ShortHand {
	
	
	/*
	 +=  : addition assignment   x += y, x= x+y ,  7+ = 8 , 7+8 = 15
	 -=  : substraction assignment    x -= y  ==> x = x-y
	 *=  : multiplication assignment   x *= y ==> x = x*y
	 /=  : division assignment         x /= y ==> x = x/y
	 %=  : remainder assignment      x %= y ==>  x= x % y
	 */
	
	public static void main(String[] args) {
		
		// +=  :               "+=" needs to be typed right next to each other, without any space.
		int a =9;
		// a = a+3;  // 12
		a += 3;  // a = a+3
		
		System.out.println(a);  // 12
		
		int b = a += 5;  // a= 17
		  //    12 +=  ==> 12+5 = 17
		
		System.out.println(b);  // 17
		System.out.println(a);  // 17
		
		int c = a +=b;          // a = 34, b= 17, c= 34
		//      17 += 17  = 34
		
		System.out.println(c);  // 34
		
		int d = a += c;   //  a = 68 , d = 68, c = 34, b = 17
		//      34 + 34 = 68
		
		System.out.println(d);  // 68
		
		int e = (d +=b) * 2;
		//      (68+17) * 2
		//        85 * 2 = 170
		
		System.out.println(e);   // d = 85, b = 17, e = 170, c = 34
		System.out.println(d);   // 85
		System.out.println(c);   // 34
		System.out.println(b);  //  17
		
		
		int f = b += d * 2;
		//      b += 170          , order of operations, so multiplication first
		//      17 + 170 = 187
		
		System.out.println(f);
		
		
   // -= :
		
		int g = 101;
		int h = g -= 1;
		//      101 -= 1  ==> 100
		System.out.println(h);  // 100
		
		int i = g += h + 5;   //  g=205, i=205, h=100;
		//     100 += 100 + 5 ==> 205
		System.out.println(i);  // 205
		
		int j = h += g % i;   // h = 100, j = 100
		//     100+=205 % 205
		//     100 += 0
		System.out.println(j);  // 100
		
		
		int k = j -= h * 2 % 5;
		//      j -= 200%5
		//      100 -= 0
		System.out.println(k);  // 100
		
		
		
	// *=  :
		
		int A = 100;
		A *= 200;  // A = A*200
		System.out.println(A);  // 20000
		
		int B = 100;
		    B *= 100 / 10;
		    
		    System.out.println(B);  // 1000
		    
		 B *= B - 1000;
		 System.out.println(B); // 1000
		 
		 
	//  /=  :
		 int C = 1000;
		     C /= 5;
		     System.out.println(C);  // 200
		     
		 int D = 10;
	// C /= D-10;   denominator cannot be 0, so it gives error.
		 System.out.println(C);  // C= 200
		 
		 C /= D+10;  // C/20 ==> 200/20 ==> 10
		 System.out.println(C);
		 
		 
	//  %=  :
		 
		 int z = 10 % 3;  // 1
		 
		 int E = 10;
		 E %= 2;  // E = 10%2
		 System.err.println(E);  // 0
		 
		 int F = 100;
		     F %= 2; // F = F%; ==> 0  so F is an even number.
		    		 
		  System.out.println(F);  // 0
		  
		  System.out.println(-100%3);  // -1
		  System.out.println(10.5%3);  // 1.5
		  System.out.println(10.0%3);  // 1.0
		  
		  int J = 300;
		  int K = 10;
		      
		  J += J %= K;
		  System.out.println(J);  // 300
		  
		  
		 
		 
				 
				 
				 
				
				
		
		
		
	}

}
