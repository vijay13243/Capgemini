package capgemini.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd(){
		Calculator calc=new Calculator();
		int actual=calc.add(10, 20);
		int expected=30;
		assertEquals(expected,actual);
		//fail("TestADD-> Not Yet Implemented");
	}
	@Test
	public void testSub(){
		Calculator calc=new Calculator();
		int actual=calc.sub(10, 20);
		int expected=-10;
		assertEquals(expected,actual);
		//fail("TestSub-> Not Yet Implemented");
	}
	@Test
	public void testMul(){
		Calculator calc=new Calculator();
		int actual=calc.mul(10, 20);
		int expected=200;
		assertEquals(expected,actual);
		//fail("TestMul-> Not Yet Implemented");
	}
	@Test
	public void testDiv(){
		Calculator calc=new Calculator();
		int actual=calc.div(20, 10);
		int expected=2;
		assertEquals(expected,actual);
		//fail("TestDiv-> Not Yet Implemented");
	}

}
