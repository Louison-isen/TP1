package isen.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	private Person person = new Person();

	@Test
	void testPerson() {
		assertEquals("unknown", person.getName());
		assertEquals(22, person.getYears());
	}

	@Test
	void testSetName() {
		person.setName("Bob");
		assertEquals("Bob", person.getName());
	}

	@Test
	void testSetYears() {
		person.setYears(30);
		assertEquals(30, person.getYears());
	}
}