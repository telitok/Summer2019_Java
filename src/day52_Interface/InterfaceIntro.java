package day52_Interface;

public interface InterfaceIntro {
	
	/*
	 {
	    instance block
	 }
	 
	 static {
	 
	 }
	 */
    
    //public InterfaceIntro() {  }    gives error, because no constructors in the interface
    
    // public void methodB() { }
    
    public default void  methodC() {
        
    }
    
    public abstract void methodA();
    
    public static void mm() {
        
    }
    
        int a = 100;
        
       // int a; // public static final by default
        // we have to initialize it, because final variables must be initialized immediately.
    
    public static void main(String[] args) {
        InterfaceIntro.mm();
        
        System.out.println(a);  // variables are static by default
      //  a = 200;  // gives error, because variables are final by default in the interface
    }
    
    
}
interface Data{
    
    
}
class Test implements InterfaceIntro, Data{
//    subtype           supertype,     supertype
    
    @Override
    public void methodA() {
        
    }
    
    
}
class A{
    
}
// class B extends A, Test{  }  a class can only extend one class


class D{
    static int a = 200;
	
	static {
		a = 500;
	}
}
