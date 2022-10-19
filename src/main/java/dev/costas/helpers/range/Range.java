package dev.costas.helpers.range;

public class Range {
	public static int[] of(int start, int end, int hop) {
		int[] range = new int[end+1 - start];
		int value = start;
		for (int i = 0; i <= end - start; i++) {
			range[i] = value;
			value += hop;
		}
		return range;
	}

	public static int[] of(int start, int end) {
		return Range.of(start, end, 1);
	}

	public static int[] of(int end) {
		return Range.of(0, end, 1);
	}
}
