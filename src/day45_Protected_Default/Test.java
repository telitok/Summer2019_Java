package day45_Protected_Default;

import day45_Inheritance.Protected_vs_Default;

public class Test extends Protected_vs_Default {
//  sub              super
/*
protected static String name;

protected static  void printHello() {
  System.out.println("Hello");
}   
*/

public static void main(String[] args) {
/*
Protectd_VS_Default obj = new Protectd_VS_Default();
obj.printHello(); // protected access modifier is not visible outside the package
obj.printHola();  // default access modifier is not visible outside the package
System.out.println( obj.name ); // protected access modifier is not visible outside the package
System.out.println( obj.id); //default access modifier is not visible outside the package

*/
System.out.println( name );
printHello();

//  System.out.println( id );  // only public and protected can be inherited outside the package




}
}
