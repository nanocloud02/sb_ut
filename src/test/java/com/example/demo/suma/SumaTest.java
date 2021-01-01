package com.example.demo.suma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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

	@BeforeEach
	public void beforeEach() {
		log.info("beforeEach");
	}

	@AfterEach
	public void afterEach() {
		log.info("AfterEach");
	}

	@Test
	public void sumaTest1() {
		log.info("sumaTest-1");
		int resultTest = suma.suma(1, 1);
		int expectedResult = 2;
		assertEquals(expectedResult, resultTest);
	}

	@Test
	public void sumaTest2() {
		log.info("sumaTest-2");
		int resultTest = suma.suma(1, 0);
		int expectedResult = 1;
		assertEquals(expectedResult, resultTest);
	}

	@AfterAll
	public static void afterAll() {
		log.info("AfterAll");
	}

}
