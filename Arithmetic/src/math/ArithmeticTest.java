package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest {

	@Test
	void testSum() {
		int expResult = 10, result;
		Arithmetic a = new Arithmetic();
		result = a.sum(2, 8);
		assertEquals(expResult, result);
	}

	@Test
	void testMultiply() {
		int expResult = 16, result;
		Arithmetic a = new Arithmetic();
		result = a.multiply(2, 8);
		assertEquals(expResult, result);
	}

}
