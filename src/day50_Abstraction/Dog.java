package day50_Abstraction;

public class Dog extends Animal {
	
	public Dog(char Gender, byte Age, String color, String Nickname) {
		super(Gender, Age, color, Nickname);
	}
	// Dog obj = new Dog('F',5,"Red","Ace");

	@Override
	public void Speak(String language) {
		System.out.println(Nickname+" is speaking "+language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname+" is eating "+food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname+" sleeps "+hour+" hours");
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(Nickname+" is drinking "+drinks);
		
	}
	
	
}
