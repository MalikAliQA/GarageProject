package vehicle;

import java.util.ArrayList;

import vehicle.child.Bike;
import vehicle.child.Car;
import vehicle.child.Motorbike;

public class Runner {
	
	public static void main(String[] args) {
		
		Garage myGarage = new Garage("Maliks Garage", 50);
		
		Car genericCar1 = new Car ("Honda", true, 4, 160, "Black", true);
		Car genericCar2 = new Car ("Ferrari", true, 4, 80, "Red", true);
		
		Bike genericBike1 = new Bike ("Bike", false, 2, 10, "Blue", true);
		Bike genericBike2 = new Bike ("Bike2", false, 2, 5, "Blue", true);
		
		
		Motorbike genericMotorbike1 = new Motorbike ("Motorbike", true, 2, 100, "Red", true);
		Motorbike genericMotorbike2 = new Motorbike ("Motorbike2", true, 2, 50, "Red", true);
						
		myGarage.addVehicle(genericCar1);
		myGarage.addVehicle(genericCar2);
		
		myGarage.addVehicle(genericBike1);
		myGarage.addVehicle(genericBike2);
		
		myGarage.addVehicle(genericMotorbike1);
		myGarage.addVehicle(genericMotorbike2);
		
		//myGarage.viewVehicle();
		myGarage.calculateBill();
		
		
		
		
		
	}

}
