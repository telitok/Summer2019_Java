package day22_NestedLoop;

public class practice {
	
	/*
	 
	    *
	    **
	    ***
	    ****
	    *****
	 */
	public static void main(String[] args) {
		
	for(int j=1; j<=10; j++) {  // kac satir yazilacagini belirliyor
		for(int i = 1; i<=j; i++) {   // bir satirda kac yildiz olacagini belirliyor
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("\n\n");
	
	/*
	    ******
	    *****
	    ****
	    ***
	    **
	    *
	 */
	
	for (int i = 1; i<=6; i++) {
		for(int j = 6; j>=i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	}

}
