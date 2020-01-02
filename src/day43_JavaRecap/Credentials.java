package day43_JavaRecap;

public class Credentials {
	
	/*
	 username
	 password
	 */
	
	private String username = "Ibrohim";
	private String password = "Prichoska";
	
	public String getUsername() {
		return username;
		
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	/*
	 create costumer class for bank account:
	 
	 1.private data: accountHolder, accountNumber, Balance, PINNumber
	 2. generate getters and setters
	 3. action: depositing, withdrawing, available balance
	            try to use getter and setters in these actions
	 */

}
