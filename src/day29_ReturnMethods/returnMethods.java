package day29_ReturnMethods;

public class returnMethods {
	
	/*
	 method decleration: 
    access-modifier specifier  returnType name(parameter){}
         public       static     void 
    return-Type: void or other data-types (int, String..)
            if the return is not void, it MUST be primitive or non primitives.
    if the return-type is void, the method does not return any value
    if the retun-Type is not void: the method MUST return a value
return statement: it's used for exiting the method, we can also use return statement to retun a vlue from the method
return method:
            1. does not have "void" as return Type
            2. MUSt return a Value
            3. the returning value MUST macth with the return-Type of the method
            4. the method body Must be closed with return statement

	 */
	
	    /*
	     access-modifier specifier  returnType name(parameter){
	                    statements;
	     }
	     */
	    
	    public static void main(String[] args) {
	        
	        name();  // this is a String value
	    //  "z"
	        
	        System.out.println( name() ); // return methods are either printed or assigned to the variable
	    
	        String str = name();
	        
	        System.out.println( str );
	    
	    
	    }
	    
	    
	    public static boolean result( ) {
	        return 8 >9;
	    }
	    
	    
	    
	    // if return type is void:
	        public static void method1() {
	            System.out.println("Hello");
	            return;
	        }
	    
	    // if the return type of the method is not void:
	        public static String name() {
	            return "bacth12";
	        //  System.out.println();   
	            //  once return statement executed it exits the method immedietly

}
}