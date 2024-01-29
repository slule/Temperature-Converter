/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Jan 28, 2024 
*/ 
package degreesConverter;

public class TempConverter {
	
	private static final double CELCIUS_TO_FAHRENHEIT_RATIO = 9.0/5.0;
	private static final double FAHRENHEIT_FREEZING_POINT = 32.0;
	
	//converting Celsius to Fahrenheit
	public static double convertCelsiusToFahrenheit(double celsius) {
		
		return (celsius * CELCIUS_TO_FAHRENHEIT_RATIO) + FAHRENHEIT_FREEZING_POINT;
	}

}
