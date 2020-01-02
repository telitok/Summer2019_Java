package day21_WhileLoops;

import java.util.Scanner;

public class WhileLoop {
	
	/*
	 While Loop:
	     
	     while (condition) {
	        statements;
	        }
	   
	    => while loop gets executed as long as the condition is true.
	    
	    => it is a repeating if statement.
	    => Compiler first checks the condition of the while loop, if it's true, it executed the loop,
	    otherwise stops executing
	    
	    ANY FOR LOOP CAN BE ALWAYS CONVERTED TO WHILE LOOP!!!
	 */
	
	public static void main(String[] args) {
		
		int a = 9;
		while (a>8) {
			System.out.println("Hello");
			a--;	
		}
		
		String sentence = "I like book, I read book";
		int count = 0;
		
		while (sentence.contains("book")) {
			count++;
			sentence=sentence.replaceFirst("book", "");  // we remove "book" after each count so the loop would not continue infinitely
		}
		System.out.println(count);
		System.out.println(sentence);  // now the sentence become "I like, I read"
	
	   
		while (true) {
			
			System.out.println("hello");
			break;  // forcefully exits the loop
		}
		
		int i = 0;
		while (true) {
			i++;
			System.out.println("Hello: "+i);
			if (i == 5) {
				break;
			}
			
		/*
		  use while loop to print all even number between 1-100
		 */
			
			for (int z =1; z<= 100; z++ ) {
				if (z%2==0) {
					System.out.println(z+" ");
				}
				/*
				 
				 Converting for loop to while loop:
				    initialization;
				      while (condition) {
				          statements;
				          iterator;
				       }
				 */
			
			}
		}
		int x = 1;
        while(x <= 100) {
            if(x%2==0) {
                System.out.print(x+" ");
            }
            
            x++;
        }
    
        System.out.println();

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Starting number");
		int start = scan.nextInt();
		
		System.out.println("ending number");
		int end = scan.nextInt();
		
		/*
		 for (int j = start; j <end ; j++) {
			if (j%2 == 0) {
				System.out.print(j+ " ");
			}
		} */
		
		int j = start;
		while (j <= end) {
			if (j %2 == 0)
				System.out.println(j+" ");
		}
		j++;
		
	}

}


