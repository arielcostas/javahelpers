package dev.costas.helpers.range;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RangeTest {

	@Test
	void testOfEnd() {
		var actual = Range.of(10);
		int[] expected = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expected, actual);
	}

	@Test
	void testOfStartEnd() {
		var actual = Range.of(5, 15);
		int[] expected = new int[]{5,6,7,8,9,10,11,12,13,14,15};
		assertArrayEquals(expected, actual);
	}

	@Test
	void testOfStartEndHop() {
		var actual = Range.of(5, 25, 2);
		int[] expected = new int[]{5,7,9,11,13,15,17,19,21,23,25};
		assertArrayEquals(expected, actual);
	}
}