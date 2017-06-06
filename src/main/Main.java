package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import beans.Personne;

public class Main {
	
	public static void main(String[] args) {
		Personne p = new Personne();
		System.out.println(p.toString());
	}

	public void blabla() {
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
            	String[] country = line.split(",");
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
