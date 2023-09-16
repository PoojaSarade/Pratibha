package readPropetyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
	
		//read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");   //file file
		
		//create a object of properties class
		Properties prop = new Properties();
		//make a file ready to read
		prop.load(fis);
		//read the particular property from file
		String data = prop.getProperty("Password");
		System.out.println(data);
		

	}

}
