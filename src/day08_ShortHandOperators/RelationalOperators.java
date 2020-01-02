package day08_ShortHandOperators;

public class RelationalOperators {
	
	/*
	 Relational Operators : returns boolean expressions
	   >   : greater than
	   >=  : greater than or equal
	   <   : less than
	   <=  : less than or equal
	   ==  : equal
	   !=  : not equal
	   
	   
	   = : a single equal sign is used to assign something
	   ! : a single exclamation mark means logical opposite
	 */
	
	public static void main(String[] args) {
		
		System.out.println( 10 > 9 );  // true
		boolean resultA = 10>9;
		System.out.println(resultA);
		
		System.out.println( 10 >= 9 );  // greater or equal
		
		boolean resultB = 10 >= 9;
		System.out.println(resultB);
		
		boolean resultC = 10 <= 9;  // less than or equal
		System.out.println(resultC);
		
		boolean resultD = 1100 < 1200;
		System.out.println(resultD);
		
		boolean resultE = 1000 < 1000;
		System.out.println(resultE);
		
		boolean resultF = 1000 <= 1000;
		System.out.println(resultF);
		
		
	// ==
		
		boolean resultG = 19 == 19;  // equal
		System.out.println(resultG);  // true
		
		
	// !=
		boolean resultH = 20 != 20;
		System.out.println(resultH);
		
		boolean A = true == !false;
		System.out.println(A);  // true
		
		boolean A2 = ! false;  // true
		System.out.println(A2);
		
		boolean B = !true;  // false
		
		
		/*
		 in java :
		    true == true, false == false
		    !false = true, !true = false
		    so therefore:
		        !false does not equal to  true
		 */
		
		boolean C = !false != !true;
		System.out.println(C);  // true
		
		boolean D = true == !false;
		System.out.println(D);  // true
		
		boolean E = !(!true);
		System.out.println(E);  // true
		
		boolean F = 10 > 9 == 9< 10;
		System.out.println(F);  // true
		
		
		
	// practice ! (not) :  logical opposite
		
		boolean g = false;
		System.out.println(!g);  // true
		System.out.println(!true == false);  // true
		
		boolean h = "Batch12" == "Batch13";  // false
		System.out.println(h);
		
		System.out.println( "batch12" == "Batch12");  // false, because java is case sensitive.
		
		System.out.println( "cybertek" != "club");  // true
		
		System.out.println( "Kuzzat" == "bad guy");  // false
		
		System.out.println("Assistant teacher in class" == "Awesome");  // false
		
		
		int num = 198;
		System.out.println(num %= 2);
		
		byte ByteNum = 30;
	//	int Inum = Inum += ByteNum;    gives compile error, because we have not given any value to Inum yet.
		
		
		
		
	}

}
