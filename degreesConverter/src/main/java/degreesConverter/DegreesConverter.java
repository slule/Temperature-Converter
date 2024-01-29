/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Jan 28, 2024 
*/ 
package degreesConverter;

import java.util.Scanner;

public class DegreesConverter {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// getting city name
		System.out.print("Enter city name: ");
		String city = scanner.next();
		
		//getting country name
		System.out.print("Enter country name: ");
		String country = scanner.next();
		
		//getting the current temperature that needs to be converted
		System.out.print("Enter temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = TempConverter.convertCelsiusToFahrenheit(celsius);
		
		System.out.println("Temnperature in" + city + "," + country + ": " + fahrenheit + "°F");	
		
		scanner.close();

	}

}
