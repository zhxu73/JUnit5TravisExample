package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.Library;

public class LibTest {

	@Test
	public void test1() {
		Library lib = new Library();
		assertTrue(lib.max(5, 10) == 10);
		assertTrue(lib.max(12, 3) == 12);
	}

	@Test
	public void test2() {
		Library lib = new Library();
		assertTrue(lib.min(5, 10) == 5);
		assertTrue(lib.min(12, 3) == 3);
	}
}
