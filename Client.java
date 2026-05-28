package hennaArtistryBookingSystem;

//represents a client who books a henna appointment

public class Client {
	
	// clients name, phone number, and email
	private String name;
	private String phoneNumber;
	private String email;
	
	//public so appointment and main can use it
	public Client(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	//this method gives the user their name, number, and email when 
	//wanting to see their profile in #6 menu option
	public String clientInfo() {
		return "name: " + name + "\nnumber: " + phoneNumber + "\nemail: " + email;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
