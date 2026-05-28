package hennaArtistryBookingSystem;

//this class represents a henna design type with a style, description,
//and base price

public class DesignType {

	//style, description, and price
	private Style style;
	private String description;
	private double price;
	
	public DesignType(Style style, String description, double price) {
		super();
		this.style = style;
		this.description = description;
		this.price = price;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
