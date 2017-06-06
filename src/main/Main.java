package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		int max = 135655;
		
		BufferedWriter writer = null;
		BufferedReader br = null;
		
        try {
            //create a temporary file
            File logFile = new File("ville_rue.csv");

            // This will output the full path where the file will be written to...
            System.out.println(logFile.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(logFile));
            
            String line = "";


            br = new BufferedReader(new FileReader("resources/prenom.csv"));
                
            while((line = br.readLine())!= null) {
            	String[] country = line.split(";");
            	writer.write(country[0]+","+country[1]+"\n");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
            	if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
	}
}
