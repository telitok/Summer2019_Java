package day20_JavaRecap;

public class WarmUp1 {
	
	public static void main(String[] args) {
		
		/*
		 Warm up:
    1. find the sum of all the numbers between 1 to 1000
    2. find the sum of all even numbers between 1 to1000
    3. find the sum of all odd numbers between 1 to 1000
    

		 */
		
		// int sum= 1+2+3+4+5......1000;
		
		/*
		 for (initialization; condition; iterator) {
		 }
		 */
		
		// Task 1:
		
		int sum1 = 0;
		for(int i = 1; i<= 1000; i++) {
			sum1 +=i;
	}
		System.out.println("sum of all nums: "+sum1);
		
		// Task 2:
		int sum2 = 0;
		for (int i = 1; i<=1000; i++) {
			if (i%2==0) {
				sum2+=i;
			}
		}
          System.out.println("Sum of all even nums: "+sum2);
          
          // Another way:
          
          int Sum2 = 0;
          for (int i = 2; i<= 1000; i+=2) {
        	  Sum2 += i;
          }
          System.out.println("Sum of all even nums: "+Sum2);
          
          
          // Task 3:
          
          int sum3 = 0;
          for (int i = 1; i<=1000; i++) {
        	  if (i%2 == 1) {
        		  sum3 += i;
        	  }
          }
          System.out.println("sum of all odd nums: "+sum3);
          
          // Another way:
          
          int Sum3 = 0;
          for ( int i= 1; i<= 1000; i+=2) {
        	  Sum3 += i;
          }
          System.out.println("sum of all odd numbers: "+Sum3);
}
}