package dev.costas.javahelpers;

import java.util.HexFormat;

/**
 * Util for hexadecimal handling.
 */
public class HexUtil {
	/**
	 * Encodes a string to hexadecimal.
	 * @param text The string to encode.
	 * @return The encoded string.
	 * @throws IllegalArgumentException if {@code text} is null
	 */
	public static String encode(String text) throws IllegalArgumentException {
		if (text == null) {
			throw new IllegalArgumentException("Text cannot be null");
		}
		return HexFormat.of().formatHex(text.getBytes()).toUpperCase();
	}

	/**
	 * Decodes a hexadecimal string.
	 * @param text The string to decode.
	 * @return The decoded string.
	 * @throws IllegalArgumentException if {@code text} is null
	 */
	public static String decode(String text) throws IllegalArgumentException {
		if (text == null) {
			throw new IllegalArgumentException("Text cannot be null");
		}
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < text.length(); i += 2) {
			String substr = text.substring(i, i+2);
			output.append((char) Integer.parseInt(substr, 16));
		}
		return output.toString();

	}
}
