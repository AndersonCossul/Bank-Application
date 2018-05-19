package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Anderson Cossul
 */
public class CSV {
	
	/**
	 * @param file (Path String)
	 * @return List. Each item will be also be a list.
	 */
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<>();
		String dataRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			while ((dataRow = br.readLine()) != null) {;
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("There was a problem when reading the CSV file.");
		}
		
		return data;
	}

}
