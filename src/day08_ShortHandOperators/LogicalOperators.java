package day08_ShortHandOperators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		/*
		 &&  : And logic  ==> true && true == true, if both conditions are true, will return true. Otherwise ==> false.
		 ||  : Or logic   ==>  true || false ==> true
		                       true || true ==> true
		                       false || false ==> false
		   If both conditions are false it will return false, otherwise it will return true.
		 */
		
		// && :
		
		boolean ResultA = 9 == 0 && "Muhtar" == "good";
		//                 false        false         ==> false
		
		System.out.println(ResultA);  // false
		
		boolean ResultB = 8>5 && 7 == (8-2+1);
		System.out.println(ResultB);  // True
		
		boolean ResultC = !false != true && !false ==! (!true);
		//                 true != true &&  true == !false
		//                     false    &&      true
		System.out.println(ResultC);  // false
		
	// || :
		
		boolean A = "Monday" == "Fun-day" || 6==6;
		//                  false             true  ==>  true
		System.out.println(A);  // true
		
		boolean B = true || false;  // ==> true
		System.out.println(B);  // true
		
		boolean C = !(8>5) || !("Today" != "friday");
		//          false           false          ==> false
		System.out.println(C);  // false
		
	
	
	// || &&  :
		
		boolean D = true && true || false;
		//              true     ||  false
		System.out.println(D);  // true
		
		boolean E = !( 7> 5  && 6 != 5) && (9>5 || 10 > 4);
		//          !  true              &&      true   
		//          false               &&        true   ==>   false
		System.out.println(E);  // false
		
		
		
	}	
	}
