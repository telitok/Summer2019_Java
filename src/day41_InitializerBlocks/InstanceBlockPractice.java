package day41_InitializerBlocks;

public class InstanceBlockPractice {
	
	public String name="Shirin";  // instance variable
	
    public InstanceBlockPractice() {
		this(10);  // assigns "Muhtar" to the name.
		name = "Dinara";  // However, it still gives Dinara, because, right after muhtar, it is reinitialized to Dinara.
		//this(10);  // constructor call must be first
	}
	
	{  // instance block
		name = "Mihray";
	}
	{
		name="Hatice";
	}
	
	public InstanceBlockPractice(int a) {
		name = "Muhtar";
		
	}
	
	
	public static void main(String[] args) {
		
		InstanceBlockPractice obj = new InstanceBlockPractice();
		   obj.name = "Tugba";
		System.out.println(obj.name);
		
		InstanceBlockPractice obj2 = new InstanceBlockPractice();
		System.out.println(obj2.name);
		
	}

}
