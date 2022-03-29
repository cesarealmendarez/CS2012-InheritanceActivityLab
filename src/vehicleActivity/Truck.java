package vehicleActivity;

public class Truck extends LandVehicle{
	private int cargoSize;
	private int maxSize;
	private int minSize;
	private String cargoType;
	
	public Truck() {
		
	}
		
	public Truck(int cargoSize, int maxSize, int minSize, String cargoType) {
		this.cargoSize = cargoSize;
		this.maxSize = maxSize;
		this.minSize = minSize;
		this.cargoType = cargoType;
	}
	
	public Truck(int cargoSize, int maxSize, int minSize, String cargoType, int numWheels, int numDoors, String color, int range, int weight, int maxWeight, int minWeight, String fuelType) {
		this.cargoSize = cargoSize;
		this.maxSize = maxSize;
		this.minSize = minSize;
		this.cargoType = cargoType;
		setNumWheels(numWheels);
		setNumDoors(numDoors);
		setColor(color);
		setWeight(weight);
		setMaxWeight(maxWeight);
		setMinWeight(minWeight);
		setFuelType(fuelType);
		setRange(range);
	}

	public int getCargoSize() {
		return cargoSize;
	}

	public void setCargoSize(int cargoSize) {
		this.cargoSize = cargoSize;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getMinSize() {
		return minSize;
	}

	public void setMinSize(int minSize) {
		this.minSize = minSize;
	}

	public String getCargoType() {
		return cargoType;
	}

	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}
	
	@Override
	public String toString() {
		return "TRUCK - " + "COLOR: " + color + ", RANGE: " + range + "Km, WEIGHT: " + weight + "Kg, MAX WEIGHT: " + maxWeight + "Kg, MIN WEIGHT: " + minWeight + "Kg, FUEL TYPE: " + fuelType + ", NUM WHEELS: " + numWheels + ", NUM DOORS: " + numDoors + ", CARGO SIZE: " + cargoSize + ", MAX SIZE: " + maxSize + ", MIN SIZE: " + minSize + ", CARGO TYPE: " + cargoType; 
	}
	

	
}
