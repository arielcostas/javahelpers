package dev.costas.javahelpers;

/**
 * Util for base64 handling.
 */
public class Base64Util {
	/**
	 * Encodes a string to Base64.
	 * @param text The string to encode.
	 * @return The encoded string.
	 * @throws IllegalArgumentException if {@code text} is null
	 */
	public static String encode(String text) throws NullPointerException {
		if (text == null) {
			throw new IllegalArgumentException("Text cannot be null");
		}
		return java.util.Base64.getEncoder().encodeToString(text.getBytes());
	}

	/**
	 * Decodes a Base64 string.
	 * @param text The string to decode.
	 * @return The decoded string.
	 * @throws IllegalArgumentException if {@code text} is null
	 */
	public static String decode(String text) throws IllegalArgumentException {
		if (text == null) {
			throw new IllegalArgumentException("Text cannot be null");
		}
		return new String(java.util.Base64.getDecoder().decode(text));
	}
}
