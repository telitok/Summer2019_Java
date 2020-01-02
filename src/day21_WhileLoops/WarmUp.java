package day21_WhileLoops;

public class WarmUp {
	public static void main(String[] args) {
		
		/*
			 1. Write a java program that can count how many times the word "book" is appeared in a String
			 Ex: 
			 input : I like books, I have books, I need books
			 Output: 3
		 */
		
		String sentence = "I like books, I have books, I need books";
		int count = 0;
		
		for (int i = 0; i<sentence.length()-3; i ++) {  // We said length()-3 to make sure as it counts it does not exceed the total number of characters in the sentence
			
			if (sentence.substring(i, i+4).equals("book")) {  // substring (0,4)
				// substring (0,4)
				count++;
			}
			
		}
		System.out.println(count);
		
		String words = "Cybertek is a school, Cybertek is great, I love Cybertek";
		
		int nTimes = 0;
		for( int i= 0; i<words.length()-7; i++) {
			if(words.subSequence(i, i+8).equals("Cybertek")) {
				nTimes++;
			}
			
		}
		System.out.println(nTimes);
		
		/*
		 Write a java program that can remove the duplicated values from a String
		   Ex: 
		     input: aabbcc
		     output: abc
		 */
		
		String s1 = "aabbcc";  // when I remove the duplicates I will have a new value
		String result= "";  // abc,  we will store the new String value in this empty String
		
		for (int i = 0; i< s1.length(); i++) {
			if (!result.contains(s1.substring(i,i+1))) {
				//              (""+s1.charAt(i))  ==> other way of doing it
				result += s1.substring(i,i+1);
			}
		}
		System.out.println(result);
		
	}

}
