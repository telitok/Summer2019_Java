package day04_variables2;

public class WarmupTask {

	/*
	 1. Cucumber        = $2.5     => float or double
	 2. Onion           = $1.5     => float or double
	 3. Green Pepper    = $2       => byte, short, int, long, float, double
	 4. Tomato         = $3
	 5. Carrot          = $4
	 
	 */

	public static void main(String[] args) {
		// Cucumber: 
		// int cucumber = 2.5;   when we write it like this, we get errors, because we can assign only whole numbers to int.
	
		
		float Cucumber = 2.5f;    // do not forget to add "f" or "F". Without "f" it gives an error, because considers it as double. And float cannot have double.
		double Cucumber2 = 2.5f;   // we may or may not add "f" here. Double can contain float.
		double Cucumber3 = 2.5;
	
		// onion: 1.5
		float Onion = 1.5f;
		double Onion2 = 1.5;
		
		// Green Pepper: $2
		byte GreenPepper = 2;
		short GreenPepper2 = 2;
		int GreenPepper3 = 2;
		long GreenPepper4 = 2l;
		float GreenPepper5 = 2;  // when give a decimal point we have to add "f" at the end for float
		double GreenPepper6 = 2;
		
		
		
		System.out.println(GreenPepper);
		System.out.println(GreenPepper2);
		System.out.println(GreenPepper3);
		System.out.println(GreenPepper4);
		System.out.println(GreenPepper5);   // prints out as 2.0. Because double and float converts the whole numbers to decimals
		System.out.println(GreenPepper6);
	}
}
