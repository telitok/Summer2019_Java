package day44_AccessModifiers;

import java.util.Arrays;
//import static day44_AccessModifiers.Testdata.Name;
//                  packagename    classname.staticName
 
import static day44_AccessModifiers.Testdata.*;
 
public class Test {
    public static String Name ="Muhtar";
    
    public static void main(String[] args) {
    	defaultAccessModifier obj = new defaultAccessModifier();
    	System.out.println(obj.namePublic);
    	// System.out.println(obj.namePrivate);  // not accessible
    	System.out.println(obj.nameDefault);   // visible within the same package
        
        System.out.println( Name );
        System.out.println(Testdata.Name);
        System.out.println( ID );
        System.out.println( SchoolName);
        
        printHello();
        
        System.out.println(age);
        
        
        
        
    }
}