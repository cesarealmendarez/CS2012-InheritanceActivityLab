package vehicleActivity;

public class Glider extends AirVehicle{
	private double wingSpan;
	
	public Glider() {
		
	}
	
	public Glider(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	public Glider(double wingSpan, int maxAltitude, String color, int range, int weight, int maxWeight, int minWeight, String fuelType) {
		this.wingSpan = wingSpan;
		setMaxAltitude(maxAltitude);
		setColor(color);
		setWeight(weight);
		setMaxWeight(maxWeight);
		setMinWeight(minWeight);
		setFuelType(fuelType);
		setRange(range);
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	@Override
	public String toString() {
		return "GLIDER - " + "COLOR: " + color + ", RANGE: " + range + "Km, WEIGHT: " + weight + "Kg, MAX WEIGHT: " + maxWeight + "Kg, MIN WEIGHT: " + minWeight + "Kg, FUEL TYPE: " + fuelType + ", MAX ALTITUDE: " + maxAltitude + "Km, WING SPAN: " + wingSpan + "km"; 
	}
}
