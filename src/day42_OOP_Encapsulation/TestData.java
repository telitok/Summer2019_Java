package day42_OOP_Encapsulation;

public class TestData {
	
	/*
	 Name
	 ID
	 */
	
	private String Name = "Bekir";  // this data is not visible to any other class.
	private int ID = 897;
	
// getter: to access the private data from another class
	public String getName() {  // read the private data only
		return Name;  
	}
	public int getID() {
		return ID;
	}
	
// setter: to change the value
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setID(int ID) {
		this.ID = ID;  // without this keyword it would be local variable to local variable
		               // whit this keyword it becomes "instance variable = local variable"
		
	}
		

}
