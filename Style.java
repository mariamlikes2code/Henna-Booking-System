package hennaArtistryBookingSystem;

//represents the fixed henna styles a client can choose from
//each style has a corresponding price that will be summed up with
//the other design complexities and placements

public enum Style {

	BRIDAL(40.00), 
	DAINTY(10.00), 
	FLORAL(15.00), 
	KHALEEJI(20.00), 
	DESI(20.00);
	
	private double price;
	
	Style(double price){
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
