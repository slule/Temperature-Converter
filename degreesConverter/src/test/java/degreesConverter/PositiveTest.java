/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Jan 28, 2024 
*/ 
package degreesConverter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PositiveTest {


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPositiveConverterTest() {
		TempConverter converter = new TempConverter ();
		double celsius = 20.0;
		double expectedFahrenheit = 68.0;
		assertEquals(expectedFahrenheit, TempConverter.convertCelsiusToFahrenheit(celsius), 0.0001);
	}

}
