package com.example.demo.suma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumaTest {

	Suma suma = new Suma();

	@Test
	public void sumaTest() {
		int resultTest = suma.suma(1, 1);
		int expectedResult = 2;
		assertEquals(expectedResult, resultTest);
	}

}
