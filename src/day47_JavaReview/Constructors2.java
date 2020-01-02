package day47_JavaReview;

class Cinthya {
	
	public Cinthya(int a) {
		this(5.5);
		System.out.println("A");
		//this(5.5);  gives error, because constructor call must be first
		
	}
	public Cinthya(double b) {
		// this(5.5);   gives error, cannot call itself
		// this(10); // this calls the above constructor which is calling this constructor and constructor cannot contain/call itself
		System.out.println("B");
	}
	public Cinthya(String str) {
		System.out.println("C");
	}
	
}

public class Constructors2 extends Cinthya {
	
	public Constructors2() {
		super("A");  // will print C because it is the one with a string argument.
		
	}
	public static void main(String[] args) {
		Constructors2 obj = new Constructors2(); // 
	}

}
