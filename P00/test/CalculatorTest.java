import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 2;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 4;
		assertEquals (expected, actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 10;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 5;
		assertEquals (expected, actual);
	}
}
