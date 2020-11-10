package vehicle.child;

import vehicle.Vehicle;

public class Bike extends Vehicle {
	
	//attributes 
	protected boolean requiresHelmet = true;

	
	//constructors
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String name, boolean hasEngine, int noOfWheels, int topSpeed, String colour, boolean requiresHelmet) {
		super(name, hasEngine, noOfWheels, topSpeed, colour);
		this.requiresHelmet = requiresHelmet;
		// TODO Auto-generated constructor stub
	}
	
	
	//methods
	@Override
	public int price() {
		 int baseprice = 100;
		 //System.out.println(baseprice);
		return baseprice;
	}

	public boolean isRequiresHelmet() {
		return requiresHelmet;
	}

	public void setRequiresHelmet(boolean requiresHelmet) {
		this.requiresHelmet = requiresHelmet;
	}
	
	

	

}
