package vehicle.child;

import vehicle.Vehicle;

public class Motorbike extends Vehicle {
	
	//attributes
	protected boolean requiresSpecialClothing = true;

	
	//constructor
	public Motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorbike(String name, boolean hasEngine, int noOfWheels, int topSpeed, String colour, boolean requiresSpecialClothing) {
		super(name, hasEngine, noOfWheels, topSpeed, colour);
		this.requiresSpecialClothing = requiresSpecialClothing;
		// TODO Auto-generated constructor stub
	}
	
	
	//methods
	@Override
	public int price() {
		 int baseprice = 1000;
		 //System.out.println(1000);
		return baseprice;
	}

	//getters and setters
	public boolean isRequiresSpecialClothing() {
		return requiresSpecialClothing;
	}

	public void setRequiresSpecialClothing(boolean requiresSpecialClothing) {
		this.requiresSpecialClothing = requiresSpecialClothing;
	}
	
	
	
	
	
	

}
