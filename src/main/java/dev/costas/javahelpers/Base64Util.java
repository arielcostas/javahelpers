package dev.costas.javahelpers;

/**
 * Util for base64 handling.
 */
public class Base64Util {
	/**
	 * Encodes a string to Base64.
	 * @param text The string to encode.
	 * @return The encoded string.
	 */
	public static String encode(String text) {
		return java.util.Base64.getEncoder().encodeToString(text.getBytes());
	}

	/**
	 * Decodes a Base64 string.
	 * @param text The string to decode.
	 * @return The decoded string.
	 */
	public static String decode(String text) {
		return new String(java.util.Base64.getDecoder().decode(text));
	}
}
