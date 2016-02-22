package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator dummy = new Calculator();
	
	@Test
	public void testCalculator() {
		assertNotNull(dummy);
	}
	
	public void testgetTotal(){
		assertEquals(0,dummy.getTotal());
	}
	
	public void testAdd() {
		dummy.add(10);
		assertEquals(10,dummy.getTotal());
		dummy.add(12);
		assertEquals(22,dummy.getTotal());
	}
	
	public void testSubtract() {
		dummy.add(10);
		assertEquals(10,dummy.getTotal());
		dummy.subtract(2);
		assertEquals(8,dummy.getTotal());
		dummy.subtract(9);
		assertEquals(-1,dummy.getTotal());
	}
	
	public void testMultiply() {
		dummy.multiply(4);
		assertEquals(0,dummy.getTotal());
		dummy.add(2);
		dummy.multiply(4);
		assertEquals(8,dummy.getTotal());
		dummy.multiply(0);
		assertEquals(0,dummy.getTotal());
	}
	
	public void testDivide() {
		dummy.divide(4);
		assertEquals(0,dummy.getTotal());
		dummy.divide(0);
		assertEquals(0,dummy.getTotal());
		dummy.add(4);
		dummy.divide(2);
		assertEquals(2,dummy.getTotal());
	}
	
	public void testGetHistory() {
		fail("Not yet implemented");
	}
	

}
