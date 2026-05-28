package hennaArtistryBookingSystem;

//represents the fixed complexities a client can choose from
//each style has a corresponding price that will be summed up with
//the other design styles and placements

public enum Complexity {
	
	SIMPLE(15.00),
	MEDIUM(30.00), 
	INTRICATE(50.00);
	
	private double price;
	
	Complexity(double price){
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

}
