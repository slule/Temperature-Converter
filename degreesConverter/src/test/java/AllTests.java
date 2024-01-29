/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Jan 28, 2024 
*/

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import degreesConverter.NegativeTest;
import degreesConverter.PositiveTest;


@RunWith(Suite.class)
@SuiteClasses({PositiveTest.class, NegativeTest.class})
public class AllTests {

}
