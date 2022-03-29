package vehicleActivity;

public class Balloon extends AirVehicle{
	private String buoyantGas;
	
	public Balloon() {
		
	}
	
	public Balloon(String buoyantGas) {
		this.buoyantGas = buoyantGas;
	}
	
	public Balloon(String buoyantGas, int maxAltitude, String color, int range, int weight, int maxWeight, int minWeight, String fuelType) {
		this.buoyantGas = buoyantGas;
		setMaxAltitude(maxAltitude);
		setColor(color);
		setWeight(weight);
		setMaxWeight(maxWeight);
		setMinWeight(minWeight);
		setFuelType(fuelType);
		setRange(range);
	}

	public String getBuoyantGas() {
		return buoyantGas;
	}

	public void setBuoyantGas(String buoyantGas) {
		this.buoyantGas = buoyantGas;
	}
	
	@Override
	public String toString() {
		return "BALLOON - " + "COLOR: " + color + ", RANGE: " + range + "Km, WEIGHT: " + weight + "Kg, MAX WEIGHT: " + maxWeight + "Kg, MIN WEIGHT: " + minWeight + "Kg, FUEL TYPE: " + fuelType + ", MAX ALTITUDE: " + maxAltitude + ", BUOYANT GAS: " + buoyantGas; 
	}
}
