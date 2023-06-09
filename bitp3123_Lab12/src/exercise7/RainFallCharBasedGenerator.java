package exercise7;

import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class RainFallCharBasedGenerator {

	public static void main (String [] args)
	{
		// 1. Identify the destination and declare output file
		String outFile = "RainfallCharBased.txt";
		try
		{		
			// 2. Construct BufferedWriter object together with FileWriter
			FileWriter files = new FileWriter(outFile);
			BufferedWriter bwOutput = new BufferedWriter(files);
			int [] array= {5,0,0,4,1,0};
			
			// 3. Write the data
			for (int index = 0; index < array.length; index++) {
				bwOutput.write(String.valueOf(array[index]));
				bwOutput.newLine();
			}
			
			
			// 4. Clear the stream
			bwOutput.flush(); 
			
			// 5. Close the stream
			bwOutput.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}
	
}
