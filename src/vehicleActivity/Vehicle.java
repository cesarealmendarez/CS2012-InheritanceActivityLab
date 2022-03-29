package vehicleActivity;

public class Vehicle {
	protected String color;
	protected int weight;
	protected int maxWeight;
	protected int minWeight;
	protected String fuelType;
	protected int range;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String color, int weight, int maxWeight, int minWeight, String fuelType, int range) {
		this.color = color;
		this.weight = weight;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
		this.fuelType = fuelType;
		this.range = range;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getMinWeight() {
		return minWeight;
	}

	public void setMinWeight(int minWeight) {
		this.minWeight = minWeight;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
}
