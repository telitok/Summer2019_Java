package day03_Variables;

public class EscapeSquences {
	
	/*
	  \n (\r): starts from a new line
	  \t: Leaves space at the beginning (horizontal tab)
	  \\ : Prints a backslash
	  \' : Prints single quote
	  \" : Prints double quotes
	  
	  
	  
	  
	  \: backslash
	  /: front slash
	 */
	
	public static void main(String[] args) {
		System.out.println("Hello Cybertek \n Batch 12 Students");
		
		System.out.print("Tomorrow is off\n");
		System.out.print("True\r");
		System.out.println("False\n\n\n\n");
		
		
		
		System.out.println("\tClass starts tomorrow");
		
		System.out.println("\\Tugba");
		System.out.println("\'Java");
		System.out.println("Book is called \"Game of Thrones\"");
	}

}
