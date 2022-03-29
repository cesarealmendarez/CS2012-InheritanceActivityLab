package vehicleActivity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyFileManager {
	
	public void clearFile(String fileName) throws IOException {
		File vehicleProductionInventoryFile = new File(fileName);
		vehicleProductionInventoryFile.createNewFile();
		
	    FileWriter fileWriter = new FileWriter(fileName, false);
	    PrintWriter printWriter = new PrintWriter(fileWriter, false);

	    printWriter.flush();
	    printWriter.close();
	    fileWriter.close();		
	    
	    System.out.println("VehicleProductionInventory.txt was cleared");
	}


	public void appendLine(String lineToPrint, String fileName) throws IOException {
		File vehicleProductionInventoryFile = new File(fileName);
		vehicleProductionInventoryFile.createNewFile();
		
		PrintWriter outputFile = new PrintWriter(new FileWriter(fileName, true));
		outputFile.write(lineToPrint);
		outputFile.write('\n');
		outputFile.close();
	}
	
	public void appendArray(ArrayList<String> vehiclesArrayList, String fileName) throws IOException {
		File vehicleProductionInventoryFile = new File(fileName);
		vehicleProductionInventoryFile.createNewFile();
		
		PrintWriter outputFile = new PrintWriter(new FileWriter(fileName, true));
		for(String str: vehiclesArrayList) {
			outputFile.write(str + System.lineSeparator());
			outputFile.write('\n');
		}		
		outputFile.close();
		
	}
}
