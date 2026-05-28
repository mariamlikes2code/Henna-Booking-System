package hennaArtistryBookingSystem;

//parent class

public abstract class BeautyService {

	//3 variables: name, price, duration
	private String name;
	private double price;
	private int duration;
	
	public BeautyService(String name, double price, int duration) {
		super();
		this.name = name;
		this.price = price;
		this.duration = duration;
	}
	
	//used to display details of the appointment
	public String serviceDescription() {
		return "Service: " + name + "\nPrice: " + price + "\nDuration: " + duration;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	// abstract method -> so child class HennaService must implement
	public abstract String getServiceDetails();

}
