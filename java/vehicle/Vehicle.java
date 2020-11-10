package vehicle;

public class Vehicle {
	
	//Attributes
	protected String name = "";
	protected boolean hasEngine = true;
	protected int noOfWheels = 0;
	protected int topSpeed = 0;
	protected String colour = "";
	
	//Constructors
	public Vehicle() {
		super();
	}
	
	public Vehicle(String name, boolean hasEngine, int noOfWheels, int topSpeed, String colour) {
		super();
		this.name = name;
		this.hasEngine = hasEngine;
		this.noOfWheels = noOfWheels;
		this.topSpeed = topSpeed;
		this.colour = colour;
	}

	
	
	//methods
	
	public int price() {
		 int baseprice = 500;
		 System.out.println(500);
		return baseprice;
	}
	
	
	
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}



	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	

}
