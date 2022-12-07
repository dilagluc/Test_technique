package org.alatin.timeDuration;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TimeDurationTest {

	@Test
	void test() throws BadBadException {

		TimeDuration duration = new TimeDuration(0);
		TimeDuration duration2 = new TimeDuration(732);
		// System.out.println(duration.toString());
		String resultString = "0s";
		assertEquals(resultString, duration.toString());

		fail("Not yet implemented");
	}

}
