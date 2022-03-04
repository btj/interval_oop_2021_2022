package interval_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	@Test
	void test() {
		byte b = 127;
		short sh = 32767;
		int a = 7;
		long l = 1_000_000_000_000L;
		float f = 1e32f;
		double d = 1e100;
		char c = 'A';
		boolean bo = false;
		
		Interval myInterval = new Interval(10, 15);
		assertEquals(myInterval.getLowerBound(), 10);
		assertEquals(myInterval.getUpperBound(), 15);
		assertEquals(myInterval.getLength(), 5);
		
		myInterval.shift(100);
		assertEquals(myInterval.getLowerBound(), 110);
		assertEquals(myInterval.getUpperBound(), 115);
		assertEquals(myInterval.getLength(), 5);
	}

}
