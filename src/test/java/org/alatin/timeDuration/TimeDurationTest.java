package org.alatin.timeDuration;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TimeDurationTest {

	@Test
	void test() throws BadBadException {

		TimeDuration duration1 = new TimeDuration(0);
		TimeDuration duration2 = new TimeDuration(732);
		TimeDuration duration3 = new TimeDuration(7242);
		TimeDuration duration4 = new TimeDuration(73200);
		// System.out.println(duration.toString());
		String expected1 = "0s";
		String expected2 = "12m 12s";
		String expected3 = "2h 0m 42s";
		String expected4 = "20h 20m 0s";
		// System.out.println(duration4);
		assertEquals(expected1, duration1.toString());
		assertEquals(expected2, duration2.toString());
		assertEquals(expected3, duration3.toString());
		assertEquals(expected4, duration4.toString());

	}

}
