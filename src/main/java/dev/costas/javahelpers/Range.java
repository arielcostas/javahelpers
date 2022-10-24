package dev.costas.javahelpers;

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
		int[] range = new int[end + 1 - start];
		int value = start;
		for (int i = 0; i <= end - start; i++) {
			range[i] = value;
			value += step;
		}
		return range;
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
