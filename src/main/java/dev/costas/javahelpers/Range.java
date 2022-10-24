package dev.costas.javahelpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Generate a range of numbers.
 */
public class Range {
	/**
	 * Generate a range of numbers from {@code start} to {@code end} leaving a gap of {@code step}.
	 *
	 * @param start The start of the range.
	 * @param end   The end of the range.
	 * @param step  The gap between each number.
	 * @return The range of numbers.
	 */
	public static int[] of(int start, int end, int step) {
		ArrayList<Integer> list = new ArrayList<>();

		int lower, higher, hop;
		boolean inverted = false;

		if (start < end) {
			lower = start; higher = end;
		} else {
			higher = start; lower = end;
			inverted = true;
		}
		hop = Math.abs(step);

		for (int value = lower; value <= higher; value += hop) {
			list.add(value);
		}

		if (inverted) Collections.reverse(list);
		return list.stream().mapToInt(i -> i).toArray();
	}

	/**
	 * Generate a range of numbers between {@code start} and {@code end} with a hop of 1.
	 *
	 * @param start The start of the range.
	 * @param end   The end of the range.
	 * @return The range of numbers.
	 */
	public static int[] of(int start, int end) {
		return Range.of(start, end, 1);
	}

	/**
	 * Generate a range of numbers between 0 and {@code end} with a hop of 1.
	 *
	 * @param end The end of the range.
	 * @return The range of numbers.
	 */
	public static int[] of(int end) {
		return Range.of(0, end, 1);
	}
}
