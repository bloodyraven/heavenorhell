package csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		int[] tab = {0,1};
		getRandomLineCSV("resources/prenom.csv", ",", 565, tab);
	}
	
	/**
	 * 
	 * @return String or null if exception
	 */
    public static String[] getRandomLineCSV(String csvFile, String csvSplitBy, int max, int[] columns) {

        BufferedReader br = null;
        String line = "";
        int nb = (int) (Math.random() * max) + 1;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            
            for(int i = 0 ; i < nb ; i++) {
            	line = br.readLine();
            }
            String[] country = line.split(csvSplitBy);

            for (int i = 0; i < country.length; i++) {
            	System.out.println("Country : " + country[columns[i]]);
			}

            return country;

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