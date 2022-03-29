package vehicleActivity;

public class AirVehicle extends Vehicle{
	protected int maxAltitude;
	
	public AirVehicle() {
		
	}
	
	public AirVehicle(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	public AirVehicle(int maxAltitude, String color, int weight, int maxWeight, int minWeight, String fuelType, int range) {
		this.maxAltitude = maxAltitude;
		setColor(color);
		setWeight(weight);
		setMaxWeight(maxWeight);
		setMinWeight(minWeight);
		setFuelType(fuelType);
		setRange(range);
	}
	
	public int getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}
}
