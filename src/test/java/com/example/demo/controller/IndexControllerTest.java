package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IndexControllerTest {

	@Test
	public void welcomeTest() {
		IndexController ic = new IndexController();
		String[] paramArray = null;
		String expectedResponse = "El array esta vacio";
		String result = ic.welcome(paramArray);
		assertEquals(expectedResponse, result);
	}

	@Test
	public void arraySinDatosTest() {
		IndexController ic = new IndexController();
		String[] paramArray = new String[3];
		String expectedResponse = "param[0]=null\n" + "param[1]=null\n" + "param[2]=null\n";
		String result = ic.welcome(paramArray);
		assertEquals(expectedResponse, result);
	}

	@Test
	public void arrayConDatosTest() {
		IndexController ic = new IndexController();
		String[] paramArray = { "Java", "Desde", "0" };
		String expectedResponse = "param[0]=Java\n" + "param[1]=Desde\n" + "param[2]=0\n";
		String result = ic.welcome(paramArray);
		assertEquals(expectedResponse, result);
	}

}
