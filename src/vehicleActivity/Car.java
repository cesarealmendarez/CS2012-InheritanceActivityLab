package vehicleActivity;

public class Car extends LandVehicle{	
	private String bodyType;
	
	public Car() {
		
	}
	
	public Car(String bodyType) {
		this.bodyType = bodyType;
	}
	
	public Car(String bodyType, int numWheels, int numDoors, String color, int range, int weight, int maxWeight, int minWeight, String fuelType) {
		this.bodyType = bodyType;
		setNumWheels(numWheels);
		setNumDoors(numDoors);
		setColor(color);
		setWeight(weight);
		setMaxWeight(maxWeight);
		setMinWeight(minWeight);
		setFuelType(fuelType);
		setRange(range);
	}
	
	public String getBodyType() {
		return bodyType;
	}
	
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	@Override
	public String toString() {
		return "CAR - " + "COLOR: " + color + ", RANGE: " + range + "Km, WEIGHT: " + weight + "Kg, MAX WEIGHT: " + maxWeight + "Kg, MIN WEIGHT: " + minWeight + "Kg, FUEL TYPE: " + fuelType + ", NUM WHEELS: " + numWheels + ", NUM DOORS: " + numDoors + ", BODY TYPE: " + bodyType; 
	}
}
