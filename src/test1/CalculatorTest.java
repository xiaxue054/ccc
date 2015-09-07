package test1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
	private Calculator calculator=new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5,calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8,calculator.getResult());
	}

	@Test
	public void testMultiply() {
		
	}

	@Test
	public void testDivid() {
		calculator.add(8);
		calculator.divid(2);
		assertEquals(4,calculator.getResult());
	}

}
