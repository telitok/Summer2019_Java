package day50_Abstraction;

public class Cat extends Animal {
	
	public Cat(char Gender, byte Age, String color, String Nickname) {
		super(Gender, Age, color, Nickname);  // to call a constructor from the super class in the sub class
		
		
	}
	// Cat mycat = new Cat(Gender, Age, color, Nickname);
	
	@Override
    public void Speak(String language) {
        System.out.println(Nickname+" speask "+language+" Language");
    }
    @Override
    public void Eat(String food) {
        System.out.println(Nickname+" eats "+food);
    }
    @Override
    public void Sleep(int hour) {
        System.out.println(Nickname+" sleeps "+hour+" hours");
    }
    @Override
    public void Drink(String drinks) {
        System.out.println(Nickname+" drinks "+drinks);
    }
	




}
