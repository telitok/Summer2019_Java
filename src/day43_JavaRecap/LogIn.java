package day43_JavaRecap;

public class LogIn {
	
	public static void main(String[] args) {
		
		Credentials obj = new Credentials();
		//obj.getUsername("Tugba");
		//obj.password="12345";
		
		//System.out.println(obj.username);
		//System.out.println(obj.password);
		
		//read:
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
		
		obj.setUsername("Tugba");
		obj.setPassword("12345");
		
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
	}

}
