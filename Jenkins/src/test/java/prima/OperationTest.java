package prima;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.mockito.Mockito;

public class OperationTest {

	Operation calService;
	IOperation cal = Mockito.mock(IOperation.class);
	@Before
	public void setup(){
		
		
		calService = new Operation();
		calService.setCal(cal);
	}

	@Test
	public void testAddTwoNumbers(){
		Mockito.when(cal.add(3, 3)).thenReturn(6);
		Assert.assertEquals(6, calService.addTwoNumbers(3, 3));
	}
	@Test
	public void testSubTwoNumbers(){
		Mockito.when(cal.sub(3, 3)).thenReturn(0);
		Assert.assertEquals(0, calService.substractTwoNumbers(3, 3));
	}
	@Test
	public void testMulTwoNumbers(){
		Mockito.when(cal.mul(3, 3)).thenReturn(9);
		Assert.assertEquals(9, calService.MulTwoNumbers(3, 3));
	}

}
