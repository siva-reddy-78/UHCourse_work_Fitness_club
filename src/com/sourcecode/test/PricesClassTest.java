package com.sourcecode.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sourcecode.Prices;

class PricesClassTest {

	@Test
	void testYogaAmount() {
		double expected=8.50;
		Prices test=new Prices();
		double output=test.amounts("Yoga");
		assertEquals(expected,output);
	}
	@Test
	void testSpinAmount() {
		double expected=7.50;
		Prices test=new Prices();
		double output=test.amounts("Spin");
		assertEquals(expected,output);
	}
	@Test
	void testZumbaAmount() {
		double expected=9.00;
		Prices test=new Prices();
		double output=test.amounts("zumba");
		assertEquals(expected,output);
	}
	@Test
	void testBoxfitAmount() {
		double expected=9.50;
		Prices test=new Prices();
		double output=test.amounts("box fit");
		assertEquals(expected,output);
	}
	@Test
	void testBodyscluptAmount() {
		double expected=8.00;
		Prices test=new Prices();
		double output=test.amounts("bodysclupt");
		assertEquals(expected,output);
	}

}
