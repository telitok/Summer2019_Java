package day29_ReturnMethods;

public class OverloadPractices {
	
	/*
	 Overload method is a method that allows us to create methods with the same name. Parameters are different, like boolean, double, int, etc.
	 */
	
public static void main(String[] kfc) {
        
        System.out.println("String Array");
        
        boolean[] array1 = {true, false};
            main(array1);
            
        double[] array2 = {1,2,3};
          main(array2);
        
          return;
          
        //   System.out.println("hello");  // return statement exits the method as soon as it gets executed
          
          
    }
    
    
    public static void main(int[] a) {
        System.out.println("Int Array");
    }
    
    public static void main(double[] b) {
        System.out.println("double Array");
    }
    
    public static int main (boolean[] c) {  // return type does not matter
        System.out.println("boolean array");
        return 78;
    }

}
