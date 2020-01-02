package day22_NestedLoop;

public class NestedLoop {
	
	public static void main(String[] args) {
		
		/*
		 12345
		 12345
		 12345
		 12345
		 12345
		 */
		
		for (int z=0; z<5; z++) {
			for (int i=1; i<= 5; i++) {
				System.out.print(i);  // all numbers on the same line
			}
			System.out.println();  // to break the line, so it starts to print on a different line agaon
		}
		
		/*
		 *****
		 */
		
		int b = 5;
		while (b>0) {
		
		int a = 1;
		while (a<=5) {
			System.out.print("*");
			a++;
		}
		System.out.println();
		
		b--;
		}
		
		/*
		 
		  *
		  **
		  ***
		  ****
		  *****
		  ******
		  *******
		 
		 */
		
		for(int i = 1; i <= 7; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int A = 1;
		while(A <= 7) {
			int B = 1;
			while(B<=A) {
				System.out.print("*");
				B++;
			}
			System.out.println();
			A++;
		}
	}

}
