package day41_InitializerBlocks;

public class InstanceBlock {
	
	{
        System.out.println("instance block");
    }
    
    public InstanceBlock(){
        System.out.println("Constructor");
    }
    
    
    public static void main(String[] args) {
        
        InstanceBlock obj = new InstanceBlock();  // ins Cons
        InstanceBlock obj2 = new InstanceBlock(); // ins   cons
        InstanceBlock obj3 = new InstanceBlock(); // ins  cons
        
    }

}
