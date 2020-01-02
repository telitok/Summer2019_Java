package day22_NestedLoop;

public class WarmUp2 {
	/*
	 2. write a program that can check if the String is plaindrome. if it's print "true", otherwise print "false"    DO NOT USE FOR LOOP
        Ex: input: level
            output: true,  (because reversed value is still "level")
	 */
	public static void main(String[] args) {
		
		/*
		 abba ==> abba    Palindrome (if reversed version of the word or number is same with the original.
		 level ==> level  Palindrome
		 */
		
		String original = "abcdefg";
		// index:          0123456
		
		// reversed index: 6543210
		String reverse = "";  // "gfedcba"
		
		for (int i = original.length()-1; i>= 0; i--) {
		//	reverse += original.substring(i, i+1);
			reverse += original.charAt(i);
		}
		
		/* With wile Loop:
		 
		 * int i = original.length()-1;
		  while (i>0) {
		  reverse += original.substring(i, i+1);
			reverse += original.charAt(i);
			i--;
			}
		  
		 
		 */
		boolean result= original.contentEquals(reverse)? true : false;
		System.out.println(result);
	}

}
