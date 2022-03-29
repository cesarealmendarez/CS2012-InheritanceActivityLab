package vehicleActivity;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class VehicleFactoryMain {

	public static void main(String[] args) throws IOException {
		Date currentDate = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		formatter.setTimeZone(TimeZone.getTimeZone("CET"));
		String finalDateString = formatter.format(currentDate);
		
		MyFileManager fileManager = new MyFileManager();
		ArrayList<String> vehicles = new ArrayList<String>();
		
		String[] fuelTypeOptions = {"gas", "electric", "diesel", "kerosene", "methane", "none"};
		String[] buoyantGasTypeOptions = {"hot-air", "helium", "hydrogen"};
		String[] bodyTypeOptions = {"sedan", "fastBack", "coupe", "convertable", "hatchBack"};
		String[] cargoTypeOptions = {"openBed", "BoxTruck", "van", "miniVan", "dumpTruck"};
		String[] colorOptions = {"red", "blue", "pink", "yellow", "green", "purple", "white"};
		
		// kilometers
		int rangeMin = 1000;
		int rangeMax = 10000;
		int altituteMin = 100;
		int altitudeMax = 2000;
		double wingspanMin = 0.003048;
		double wingspanMax = 0.012192;
		
		// kilograms
		int weightsMin = 2000;
		int weightsMax = 6000;

		Random random = new Random();
		int carNumVersions = random.nextInt(3 + 1) + 2;
		int truckNumVersions = random.nextInt(3 + 1) + 2;
		int balloonNumVersions = random.nextInt(3 + 1) + 2;
		int gliderNumVersions = random.nextInt(3 + 1) + 2;
		    
		System.out.println("--------CREATING " + carNumVersions + " CARS--------");
		for(int i = 0; i < carNumVersions; i++) {
			Random random1 = new Random();
			int randomBodyType = random1.nextInt(5);
			int randomColor = random1.nextInt(7);
			int randomFuel = random1.nextInt(6);
			Car newCar = new Car(bodyTypeOptions[randomBodyType], 4, 2, colorOptions[randomColor], random.nextInt(rangeMax - rangeMin) + rangeMin, random.nextInt(weightsMax - weightsMin) + weightsMin, random.nextInt(weightsMax - weightsMin) + weightsMin, random.nextInt(weightsMax - weightsMin) + weightsMin, fuelTypeOptions[randomFuel]);
			vehicles.add(newCar.toString());
		}
		
		System.out.println("--------CREATING " +  truckNumVersions + " TRUCKS--------");
		for(int i = 0; i < truckNumVersions; i++) {
			Random random2 = new Random();
			int randomCargoType = random2.nextInt(5);
			int randomColor = random2.nextInt(7);
			int randomFuel = random2.nextInt(6);
			Truck newTruck = new Truck(50, 200, 100, cargoTypeOptions[randomCargoType], 4, 4, colorOptions[randomColor], random2.nextInt(rangeMax - rangeMin) + rangeMin, random2.nextInt(weightsMax - weightsMin) + weightsMin, random2.nextInt(weightsMax - weightsMin) + weightsMin, random2.nextInt(weightsMax - weightsMin) + weightsMin, fuelTypeOptions[randomFuel]);
			vehicles.add(newTruck.toString());
		}
		
		System.out.println("--------CREATING " + balloonNumVersions + " BALLOONS--------");
		for(int i = 0; i < balloonNumVersions; i++) {
			Random random3 = new Random();
			int randomBuoyantGas = random3.nextInt(3);
			int randomColor = random3.nextInt(7);
			int randomFuel = random3.nextInt(6);
			Balloon newBalloon = new Balloon(buoyantGasTypeOptions[randomBuoyantGas], random3.nextInt(altitudeMax - altituteMin) + altituteMin, colorOptions[randomColor], random3.nextInt(rangeMax - rangeMin) + rangeMin, random3.nextInt(weightsMax - weightsMin) + weightsMin, random3.nextInt(weightsMax - weightsMin) + weightsMin, random3.nextInt(weightsMax - weightsMin) + weightsMin, fuelTypeOptions[randomFuel]);
			vehicles.add(newBalloon.toString());
		}
		
		System.out.println("--------CREATING " + gliderNumVersions + " GLIDERS--------");
		for(int i = 0; i < gliderNumVersions; i++) {
			Random random4 = new Random();
			int randomColor = random4.nextInt(7);
			int randomFuel = random4.nextInt(6);
			Glider newGlider = new Glider(random4.nextDouble(wingspanMax - wingspanMin) + wingspanMax, random4.nextInt(altitudeMax - altituteMin) + altituteMin, colorOptions[randomColor], random4.nextInt(rangeMax - rangeMin) + rangeMin, random4.nextInt(weightsMax - weightsMin) + weightsMin, random4.nextInt(weightsMax - weightsMin) + weightsMin, random4.nextInt(weightsMax - weightsMin) + weightsMin, fuelTypeOptions[randomFuel]);
			vehicles.add(newGlider.toString());
		} 
		
		fileManager.clearFile("VehicleProductionInventory.txt");
		fileManager.appendLine("Number of vehicles produced " + vehicles.size(), "VehicleProductionInventory.txt");
		fileManager.appendLine("Date of production " + finalDateString, "VehicleProductionInventory.txt");
		fileManager.appendLine("----------------------------------", "VehicleProductionInventory.txt");
		fileManager.appendArray(vehicles, "VehicleProductionInventory.txt");
		System.out.println("DONE!");

	}

}
