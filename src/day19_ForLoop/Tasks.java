package day19_ForLoop;

public class Tasks {
	
	public static void main(String[] args) {
		
	// Task 1:	
		for (int i =1; i <=10; i++) {
			System.out.println("the square of "+i+ "is "+ (i*i));
		}
		
    // Task 2:
		for(int i= 1; i<=32; i++ ) {
			
			if(i%2 ==0 ) {
				System.out.println(i+" ");
			}
		}
		
	// Task 3:
for(int i= 1; i<=32; i++ ) {
			
			if(i%2 ==1 ) {
				System.out.println(i+" ");
			}
}
    // Task 4:

         String str = "Java" ;   // Question : Reverse this string
        // index nums  0123
         //           "avaJ"  
         String Reverse = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
         // Empty string with added charAt method
         
         String reversed = "";
         for(int i = 3; i>=0; i--) {
        	 reversed += str.charAt(i);
         }
         System.out.println(reversed);
         
        /*
          String str = "Cybertek";
        //            01234567
        //  "avaJ"
        String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        
        String Reversed ="";
        for(int i = str.length()-1 ; i >= 0; i--) {
            Reversed += str.charAt(i);
        }
        
        System.out.println(Reversed); 
         */
       

	}
		

}
