/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Jan 28, 2024 
*/ 
package degreesConverter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NegativeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		TempConverter converter = new TempConverter ();
		double celsius = -10.0;
		double expectedFahrenheit = 14.0;
		assertEquals(expectedFahrenheit, TempConverter.convertCelsiusToFahrenheit(celsius), 0.0001);
	}

}
