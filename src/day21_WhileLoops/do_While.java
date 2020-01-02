package day21_WhileLoops;

public class do_While {
	
	public static void main(String[] args) {
		
		boolean A = false;
		
		while (A) {
			System.out.println("Hello");
		}
		
		/*
		 do - while :
		            do {
		                statements;
		               }  while (condition);
		               
		         compiler executes the block first, and then checks the condition. If the condition is true,
		         then it keeps executing. Otherwise, it exits the loop.
		         
		         do-while loop's body gets executed at least once, regardless of the condition.
		         
		         while loop never gets executed if the condition is false.
		 */
		
		do {
			System.out.println("Hello");
		} while (A);
		
		/*
		 int x = 1;
        while(x <= 100) {
            if(x%2==0) {
                System.out.print(x+" ");
            }
            
            x++;
        }
		 */
		
		int x = 1;
		do {
			if(x%2==0) {
			System.out.println();
			}
			x++;
		} while (x <= 100);
		
		System.out.println();
		
		
		do {
			System.out.println("hello world");
		} while (true);
		
	
	}

}
