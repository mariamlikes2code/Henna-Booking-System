package hennaArtistryBookingSystem;

//this class is to build the client's appointment

public class Appointment {

	
	//client, hennaService, date, time, Status enum
	private Client client;
	private HennaService hennaService;
	private String date;
	private String time;
	private AppointmentStatus status;
	
	public Appointment(Client client, HennaService hennaService, String date, String time, AppointmentStatus status) {
		super();
		this.client = client;
		this.hennaService = hennaService;
		this.date = date;
		this.time = time;
		this.status = status;
	}

	//getters and setters
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public HennaService getHennaService() {
		return hennaService;
	}

	public void setHennaService(HennaService hennaService) {
		this.hennaService = hennaService;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public AppointmentStatus getStatus() {
		return status;
	}

	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}
	
	//confirm, cancel, pending appointments
	public void confirmAppointment() {
		this.status = AppointmentStatus.CONFIRMED;
	}
	
	public void cancelAppointment() {
		this.status = AppointmentStatus.CANCELLED;
	}
	
	public void makingAppointment() {
		this.status = AppointmentStatus.PENDING;
	}
	
	//this is to display the details of the appointment when the user
	//selects #4 in menu options
	public void displayAppointment() {
		System.out.println("Client: " + client.getName()); 
		System.out.println("Date: " + date); 
		System.out.println("Time: " + time); 
		System.out.println("Service: " + hennaService.getName()); 
		System.out.println("Style: " + hennaService.getStyle()); 
		System.out.println("Placement: " + hennaService.getPlacement()); 
		System.out.println("Complexity: " + hennaService.getComplexity()); 
		System.out.println("Price: " + hennaService.getPrice()); 
		System.out.println("Status: " + status); 

	}
}
