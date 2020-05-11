package assignment3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//This will run both tests for each use case
@RunWith(Suite.class)
@SuiteClasses({ MaximumHoursTest.class, minimumHoursTest.class })
public class AllTests {

}
