package vehicle;
import java.util.ArrayList;
import vehicle.child.Bike;
import vehicle.child.Car;
import vehicle.child.Motorbike;

public class Garage {
	//attributes
	protected String name = "";
	//protected String city = "";
	protected int price = 0;
	protected  ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	
	
	//constructor
	public Garage() {
		
		
	}
	
	
	public Garage(String name, int price) { //String city) {
		this.name = name;
		//this.city = city;
		this.price = price;
	}
	
	//methods
	public void addVehicle(Vehicle vehicle) {
		this.vehicleList.add(vehicle);

	}
	
	public void viewVehicle() {
		
		for (int x = 0; x<this.vehicleList.size(); x++) {
		System.out.println("ID: " + (x + 1) + " " + this.vehicleList.get(x).getName() + " Colour: " + this.vehicleList.get(x).getColour() + " Top Speed: " + this.vehicleList.get(x).getTopSpeed());
		System.out.println("Current price: " + this.vehicleList.get(x).price());
	}
		
	}
	
	public void removeVehicleID() {
		
		
	}
	
	public void removeVehicleType() {
		
	}
	
	public void calculateBill() {
		int count = 0;
		for (Vehicle handle: vehicleList) {
			System.out.println("ID: " + (count + 1) + " " + handle.getName() + " Colour: " + handle.getColour() + " Top Speed:" + handle.getTopSpeed());
			System.out.println("Price of Vehicle : " + handle.price());
			System.out.println("Base repair price of Garage: " + this.price);
			count++;
			if (handle instanceof Car) {
				if (handle.topSpeed > 100) {
					int totalprice = this.price + handle.price() + 100;
					System.out.println("Total repair price based on Top Speed: " + handle.price() + " + " + this.price + " + 100 = " + totalprice);
				}if (handle.topSpeed < 100) {
					int totalprice = this.price + handle.price() + 50;
					System.out.println("Total repair price based on Top Speed: " + handle.price() + " + " + this.price + " + 50 = " + totalprice);
				}
				
			}if (handle instanceof Bike) {
				if (handle.topSpeed >= 10) {
					int totalprice = this.price + handle.price() + 20;
					System.out.println("Total repair price based on Top Speed: " + handle.price() + " + " + this.price + " + 20 = " + totalprice);
					
				}if (handle.topSpeed < 10) {
					int totalprice = this.price + handle.price() + 5;
					System.out.println("Total repair price based on Top Speed: " + handle.price() + " + " + this.price + " + 5 = " + totalprice);
					
				}
			}if (handle instanceof Motorbike) {
				if (handle.topSpeed >= 100) {
					int totalprice = this.price + handle.price() + 100;
					System.out.println("Total repair price based on Top Speed: " + handle.price() + " + " + this.price + " + 100 = " + totalprice);
				}if (handle.topSpeed < 100) {
					int totalprice = this.price + handle.price() + 50;
					System.out.println("Total repair price based on Top Speed: " + handle.price() + " + " + this.price + " + 50 = " + totalprice);
				}
			}
			
			
		}
		
	}
	
	
	
	//getters and setters
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//public String getCity() {
		//return city;
	//}


	//public void setCity(String city) {
		//this.city = city;
	//}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
}
