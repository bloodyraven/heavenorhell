package csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		getRandomCity();
	}
	
	/**
	 * 
	 * @return String city or null if exception
	 */
    public static String getRandomPrenom() {
    	int max = 565;
    	return null;
    }
	
	/**
	 * 
	 * @return String city or null if exception
	 */
    public static String getRandomCity() {

        String csvFile = "resources/villes_france.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        int max = 36700;
        
        int nb = (int) (Math.random() * max) + 1;
        System.out.println(nb);
        try {

            br = new BufferedReader(new FileReader(csvFile));
            
            for(int i = 0 ; i < nb ; i++) {
            	line = br.readLine();
            }
            String[] country = line.split(cvsSplitBy);

            System.out.println("Country : " + country[3]);

            return country[3];

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return null;

    }

}