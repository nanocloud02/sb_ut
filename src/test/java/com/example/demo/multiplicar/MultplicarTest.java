package com.example.demo.multiplicar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultplicarTest {

	Multplicar suma = new Multplicar();

	@Test
	public void sumaTest1() {
		int resultTest = suma.multiplicar(1);
		int expectedResult = 1;
		assertEquals(expectedResult, resultTest);
	}

}
