package vehicleActivity;

public class LandVehicle extends Vehicle{
	protected int numWheels;
	protected int numDoors;
	
	public LandVehicle() {
		
	}
	
	public LandVehicle(int numWheels, int numDoors) {
		this.numWheels = numWheels;
		this.numDoors = numDoors;
	}
	
	public LandVehicle(int numWheels, int numDoors, String color, int weight, int maxWeight, int minWeight, String fuelType, int range) {
		this.numWheels = numWheels;
		this.numDoors = numDoors;
		setColor(color);
		setWeight(weight);
		setMaxWeight(maxWeight);
		setMinWeight(minWeight);
		setFuelType(fuelType);
		setRange(range);
	}
	
	public int getNumWheels() {
		return numWheels;
	}
	
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	public int getNumDoors() {
		return numDoors;
	}
	
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
}
