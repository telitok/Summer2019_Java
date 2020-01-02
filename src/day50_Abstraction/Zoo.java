package day50_Abstraction;

public class Zoo {
	
	public static void main(String[] args) {
		Cat Cleo = new Cat('F', (byte)5,"White & Black", "Cleo");
	//  System.out.println( "Name is "+ Cleo.Nickname );  //Cleo
	    //  System.out.println("Gender is "+Cleo.Gender );
	    //  System.out.println( "Color is "+Cleo.color );
	    //  System.out.println("Age is "+Cleo.Age);
	        
	        System.out.println("====================================");
	        Cleo.getInfo();
	        
	        Cat misha = new Cat('F', (byte)6, "White & Grey", "misha");
	            misha.getInfo();
	            misha.Sleep(15);
	            misha.Eat("chicken");
	            misha.Drink("milk");
	            misha.Speak("meow");
	            
	       Dog karabas = new Dog('M',(byte)4,"white","karabas");
	           karabas.getInfo();
	           karabas.Sleep(12);
	           karabas.Eat("meat");
	           karabas.Drink("milk");
	           karabas.Speak("Turkish");
	      
	          System.out.println("====================================");
	     
	       Dog Tuzik = new Dog('M',(byte)12, "Black","Tuzik");
	          Tuzik.getInfo();
	          Tuzik.Sleep(10);
	          Tuzik.Eat("kabob");
	          Tuzik.Drink("redbull");
	          Tuzik.Speak("Kyrgyz woof");
	          
	          System.out.println("====================================");
	          
	       Dog [] dog = {karabas, Tuzik};
	       Cat [] cat = {misha, Cleo};
	       
	       dog[1].getInfo();
	       
	       /*
	       Abstract class Countries:
	               Data: name, flag, language, population, religion, rivals, capital city
	               
	               constructor that can set all those data
	               
	               Actions (abstract): exports(parameter), import(parameter),
	                                   economy(),currency(),.........
	      sub class: 
	               South Korea
	               USA
	               Kazakhistan
	               New Zealand  
	               Mother Russia
	               Turkey
	               ......
	      abstract method, inheritance, abstract class, method overriding                          
	        
	      */
	}

}
