package com.example.demo.suma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumaTest {

	private static final Logger log = LoggerFactory.getLogger(SumaTest.class);

	Suma suma = new Suma();

	@BeforeAll
	public static void beforeAll() {
		log.info("BeforeAll");
	}

	@Test
	public void sumaTest() {
		log.info("sumaTest");
		int resultTest = suma.suma(1, 1);
		int expectedResult = 2;
		assertEquals(expectedResult, resultTest);
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("AfterAll");
		log.info("AfterAll");
	}

}
