package day59_Exceptions;

public class LunchTimeException extends Exception {
	
	public LunchTimeException() {
		super("It is lunch time");
		System.err.println("Time to end the class, let's go home");
	}

}
