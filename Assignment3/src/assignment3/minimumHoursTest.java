package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class minimumHoursTest {

	//Use case 1, Driver stays in garage for less than the minimum time for calculating charges. >0-3 hours
	@Test
	public void test() {
		ParkingCharge case1 = new ParkingCharge(0.0); //We create a new test case, initializing a PC object to 0 hours.
		double charges = case1.calculateCharges(1.5); //Case 1 of testable inputs on given code without alteration
		// Hours below minimum hours in parking garage.
		case1.setRunTotal(charges);
		double output = case1.getRunTotal();
		assertEquals("Output did not meet expected value.", 2, output, 0);
	}

}
