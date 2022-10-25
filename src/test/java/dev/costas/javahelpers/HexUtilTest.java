package dev.costas.javahelpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexUtilTest {

	@Test
	void test_EncodeString() {
		var actual = HexUtil.encode("hol");
		var expected = "686F6C";
		assertEquals(expected, actual);
	}

	@Test
	void test_EncodeEmpty() {
		var actual = HexUtil.encode("");
		var expected = "";
		assertEquals(expected, actual);
	}

	@Test
	void test_EncodeNull() {
		assertThrows(IllegalArgumentException.class, () -> HexUtil.encode(null));
	}

	@Test
	void test_DecodeString() {
		var actual = HexUtil.decode("686F6C");
		var expected = "hol";
		assertEquals(expected, actual);
	}

	@Test
	void test_DecodeEmpty() {
		var actual = HexUtil.decode("");
		var expected = "";
		assertEquals(expected, actual);
	}

	@Test
	void test_DecodeNull() {
		assertThrows(IllegalArgumentException.class, () -> HexUtil.decode(null));
	}
}