package day29_ReturnMethods;

public class WarmUp2 {
	
	public static void main(String[] args) {
		
	// Incomplete solution
	
	String str = "AABBCCDD";  // expected result = "A2B2C2D2";
	
	String expected = "";
	
	for(int j=0; j<str.length();j++) {
		int count=0;
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i) == str.charAt(j) ) {
				count++;
			}
		}
		expected+=""+str.charAt(j)+count;    // ""  converts it to string, so it does not give error due to charAt()
		  str = str.replace(""+str.charAt(j), "");
	}
	System.out.println(expected);
}
}