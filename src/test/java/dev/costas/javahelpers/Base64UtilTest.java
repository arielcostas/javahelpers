package dev.costas.javahelpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Base64UtilTest {

	@Test
	void test_EncodeString() {
		var actual = Base64Util.encode("hola");
		var expected = "aG9sYQ==";

		assertEquals(expected, actual);
	}

	@Test
	void test_EncodeEmpty() {
		var actual = Base64Util.encode("");
		var expected = "";

		assertEquals(expected, actual);
	}

	@Test
	void test_EncodeNull() {
		assertThrows(IllegalArgumentException.class, () -> Base64Util.encode(null));
	}

	@Test
	void text_DecodeString() {
		var actual = Base64Util.decode("aG9sYQ==");
		var expected = "hola";

		assertEquals(expected, actual);
	}

	@Test
	void text_DecodeEmpty() {
		var actual = Base64Util.decode("");
		var expected = "";

		assertEquals(expected, actual);
	}

	@Test
	void test_DecodeNull() {
		assertThrows(IllegalArgumentException.class, () -> Base64Util.decode(null));
	}
}