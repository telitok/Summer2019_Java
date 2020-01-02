package day18_StringClassContinue;

import java.util.Scanner;

public class WarmUp2 {
	
	    /*
	        Ex:
	         enter your first name
	            mUhTaR
	         enter your last name
	            cYBerTeK
	         
	         output:
	            Muhtar Cybertek
	         
	     */
	    public static void main(String[] args) {
	       
	    	Scanner scan = new Scanner(System.in);
	        System.out.println("Enter your first name");
	        String firstName = scan.nextLine();
	        //      mUhtAr
	        firstName = firstName.substring(0,1).toUpperCase()
	                    + firstName.substring(1).toLowerCase();
	        
	        System.out.println(firstName);
	        
	        
	        System.out.println("Enter your last name");
	        String lastName = scan.nextLine();
	        
	        lastName = lastName.substring(0,1).toUpperCase()
	                    + lastName.substring(1).toLowerCase();
	        
	        String FullName = firstName+" "+lastName;
	        System.out.println(FullName);
	        
	        
	    }
}
