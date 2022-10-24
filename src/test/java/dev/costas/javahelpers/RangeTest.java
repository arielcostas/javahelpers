package dev.costas.javahelpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RangeTest {

	@Test
	public void test_EndOnly() {
		var actual = Range.of(10);
		int[] expected = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_StartEndOnly() {
		var actual = Range.of(5, 15);
		int[] expected = new int[]{5,6,7,8,9,10,11,12,13,14,15};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_StartEndHop() {
		var actual = Range.of(5, 25, 2);
		int[] expected = new int[]{5,7,9,11,13,15,17,19,21,23,25};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_StartEndHopNegative() {
		var actual = Range.of(25, 5, -2);
		int[] expected = new int[]{25,23,21,19,17,15,13,11,9,7,5};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_EndNotInRange() {
		var actual = Range.of(5, 10, 2);
		int[] expected = new int[]{5, 7, 9};
		assertArrayEquals(expected, actual);
	}
}