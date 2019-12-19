package prima;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class primaTest {

	@Test
	public void test() {
		assertEquals(PRIMAv1.valorPrimaMain(18, 20), 1400, 0.1); 
	}

	@Test
	public void test2() {
		assertEquals(PRIMAv1.valorPrimaMain(17, 20),0,0.1); 
	}
	
	@Test public void test3() { 
		assertEquals(PRIMAv1.valorPrimaMain(20, 25),1400,0.1); 
	}
	
	@Test public void test4() { 
		assertEquals(PRIMAv1.valorPrimaMain(20, 0),0,0.1); 
	}
	
	@Test 
	public void test5() {
		assertEquals(PRIMAv1.valorPrimaMain(91, 30),0,0.1); 
	}
	
}
