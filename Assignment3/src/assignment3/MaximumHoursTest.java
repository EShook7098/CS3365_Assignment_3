package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumHoursTest {
	//Case 2, Driver stays in parking garage for a time greater than the maximum time for calculating charges. 24< hours
	@Test
	public void test() {
		ParkingCharge case1 = new ParkingCharge(0.0); //We create a new test case, initializing a PC object to 0 hours.
		double charges = case1.calculateCharges(30); //Case 2 of testable inputs on given code without alteration
		// Hours above minimum hours in parking garage.
		case1.setRunTotal(charges);
		double output = case1.getRunTotal();
		assertEquals("Output did not meet expected value.", 10, output, 0);
	}

}
