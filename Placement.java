package hennaArtistryBookingSystem;

//represents the fixed placements a client can choose from
//each style has a corresponding price that will be summed up with
//the other design complexities and styles

public enum Placement {

	FRONTHAND(10.00), 
	BACKHAND(10.00), 
	ARM(20.00);
	
	private double price;
	
	Placement(double price){
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
