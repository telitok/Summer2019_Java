package day46_SuperKeyword;

class parent{
	
	public parent (int a) {  // C A
		this("A");  // C
		System.out.println("A");  // A
		
	}
	public parent (String b) {
		System.out.println("C");
	}
	
}

public class Practice extends parent{
	//        sub              super
	
	
	 public Practice()	{
		   super(10);  // C A
		 //   this(100);   if we add this one, it gives error, because one constructor can call only one constructor.
		    
    
	 }
	 public static void main(String[] args) {
		Practice obj = new Practice();
	}
}
