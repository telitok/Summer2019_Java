package day59_Exceptions;

public class NoBreakTimeException extends RuntimeException{
	
	public NoBreakTimeException() {
		
		super("Too much breaks have occured in java course");
		System.out.println("There is no break till we get the job done");
	}

}
