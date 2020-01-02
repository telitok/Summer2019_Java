package day18_StringClassContinue;

public class StringMethods {
	
	public static void main(String[] args) {
		
		/*
        indexOf(str): returns the index number of the first 
         occurred character in the given String as an int value
         
         
         lastIndexOf(): returns the last occurred character's index number as and int value.
         
         
        
        */
		
		String A1 = "Batch 12 is a great batch";
		
		int num = A1.indexOf("g");
		System.out.println(num);
		
		int num2 = A1.indexOf("eat");
		System.out.println(num2);
		
		String B1 = "today is Tuesday, today we have class in the afternoon";
		int n1 = B1.indexOf("ternoon");  // first character's index number will be returned, index num of "t" = 47.
		System.out.println(n1);
		
		String address = "7925 Jones branch Dr, McLearn, VA 22003";
		int begin= address.indexOf(", ")+1+1; // = index of letter M
		int end = address.indexOf(", V");
		
		String cityName = address.substring(begin, end );
		System.out.println(cityName);
		
		String email = "randomemails@gmail.com";
		int begin2 = email.indexOf("@")+1;
		int end2 = email.indexOf(".com");
		
		String emailtype= email.substring(begin2, end2);
		System.out.println(emailtype);
		
		
		/*
		 lastIndexOf(): returns the last occurred character's index number as and int value.
         
		 */
		
		String str = "ABCDABCD";
		int n2 = str.indexOf("B"); // 1    Since it is a single character we could write it as char, 'B'
		int n3 = str.lastIndexOf("B");  // 5
		System.out.println(n2);
		System.out.println(n3);
		
		
		String myemail = "myemail.school@gmail.com";
		int Begin = myemail.indexOf("@")+1;
		int End = myemail.lastIndexOf(".");
		
		String myemailtype = myemail.substring(Begin, End);
		System.out.println(myemailtype);
		
		
		
	}

}
