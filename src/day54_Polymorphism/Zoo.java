package day54_Polymorphism;


	/*
	 WarmUp:
    Create a class called Animal (Donot use abstraction for now):
                Actions: Talk()
    create sub classes of Animal class:
                1. Tiger:
                        Actions: Hunts()
                2. Octopus:
                        Actions: Swim()
        override super class' instance method Talk()
    create a class called Zoo:
            Create Arrays of Tiger
            Create Arrays of Octopus

	 */

class Animal{
	
	public void Talk() {
		System.out.println("Animal is talking");
	}
}

class Tiger extends Animal {
	
	public void Hunt() {
		System.out.println("Tiger is hunting");
		
	}
	@Override
	public void Talk() {
		System.out.println("Tiger is talking ==> Roar");
	}
}

class Octopus extends Animal {
	
	public void Swim() {
		System.out.println("Octopus is swimming");
		
	}
	public void Talk() {
		System.out.println("Octopus is talking ==> gologolo");
	}
}

public class Zoo {
	
	public static void main(String[] args) {
		
		Tiger tiger1 = new Tiger();
		Tiger [] Tigers =  {tiger1, new Tiger() };
		
		
		Octopus octopus1  =  new Octopus();
		//     object name   object itself 
		Octopus [] octopus =  {octopus1, new Octopus()};
		
		
		Animal        animal1         =    new Tiger();
//   reference type	  reference name	   object
		animal1.Talk();    // ==> Animal class'tan override yaptigim Talk method'i call yapabiliyorum sadece
	//	animal1.Hunt();   gives error
		// reference type decides what can be called
		
		Animal animal2 = new Octopus();
		// animal2.Swim();
		// animal class (reference type) does not have Swim()
		
		animal2.Talk();
		}
	
}
