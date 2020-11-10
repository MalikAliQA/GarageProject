package vehicle.child;

import vehicle.Vehicle;

public class Car extends Vehicle {
	
	//attributes 
	protected boolean hasFWD = true;
	
	
	//constructor
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, boolean hasEngine, int noOfWheels, int topSpeed, String colour, boolean hasFWD) {
		super(name, hasEngine, noOfWheels, topSpeed, colour);
		this.hasFWD = hasFWD;
		// TODO Auto-generated constructor stub
	}

	
	//methods 
	@Override
	public int price() {
		 int baseprice = 2000;
		 //System.out.println(baseprice);
		return baseprice;
	}

	
	
	//getters and setters
	public boolean isHasFWD() {
		return hasFWD;
	}

	public void setHasFWD(boolean hasFWD) {
		this.hasFWD = hasFWD;
	}
	
	

}
