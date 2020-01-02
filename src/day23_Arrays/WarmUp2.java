package day23_Arrays;

public class WarmUp2 {
	/*
	 Write a program that can find unique characters from a String.
	    Ex: 
	       input: AAABCDEEFF
	       
	       output: BCD
	       
	       THIS ONE WAS AN INTERVIEW QUESTION!!!
	 */
	
	public static void main(String[] args) {
		
		String str = "AAABCDEEFF";
		String unique = "";  // to store all the unique chars
		
	for (int j= 0; j<str.length();j++) {
		
		int count = 0;
		
		for (int i=0; i< str.length(); i++) {
			if (str.substring(i,i+1).equals(""+str.charAt(j))) {
				count++;
			}
		}
		
		if(count == 1) {
			unique+=""+str.charAt(j);
		}
	}
	System.out.println(unique);
	
	
	// Example 2:
	
	String str2= "ALL THE LETTERS";
	String Unique= "";
	
	for(int z=0; z<str2.length(); z++) {
	
		int count2= 0;
		for (int a=0; a< str.length(); a++) {
			                                 // str.substring(j, j+1)
			if( str2.substring(a,a+1).equals(""+str2.charAt(z))) {
				count2++;    //              this quotation mark helps us to convert charAt to string.
			}
		}
		if (count2==1) {
			Unique+=(""+str2.charAt(z));
		}
	}
	
	System.out.println(Unique);
	}

}
