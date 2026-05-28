package hennaArtistryBookingSystem;

//this class will inherit all the attributes of BeautyService
//it will get into the specifics of the henna service the company has to offer

public class HennaService extends BeautyService {
	
	//style, placement, complexity
	private Style style;
	private Placement placement;
	private Complexity complexity;
	
	public HennaService(String name, double price, int duration, Style style, Placement placement,
			Complexity complexity) {
		super(name, price, duration);
		this.style = style;
		this.placement = placement;
		this.complexity = complexity;
	}

	//getters and setters
	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public Placement getPlacement() {
		return placement;
	}

	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

	public Complexity getComplexity() {
		return complexity;
	}

	public void setComplexity(Complexity complexity) {
		this.complexity = complexity;
	}

	//implement abstract method from parent class
	@Override
	public String getServiceDetails() {
	    return "Style: " + style + "\nPlacement: " + placement + "\nComplexity: " + complexity;
	}
	

	
}
