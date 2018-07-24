//assertEquals(false, a.getFull());
//assertArrayEquals(exp, testA.toArray());

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CellTest 
{
	Cell a = new Cell();
	Cell b = new Cell(0);
	Cell c = new Cell(1);

	//**********************************
	// constructor
	//**********************************
	@Test
	public void constructTest_0() 
	{	
		assertEquals(false, a.getFull());
	}	
	@Test
	public void constructTest_1() 
	{
		assertEquals(false, b.getFull());
	}
	@Test
	public void constructTest_2() 
	{
		assertEquals(true, c.getFull());
	}
	@Test
	public void possibleValuesTest_0() 
	{
		int[] A = a.possibleValuesToArray();
		int[] exp = {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(exp, A);
	}
	@Test
	public void possibleValuesTest_1() 
	{
		int[] B = b.possibleValuesToArray();
		int[] exp = {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(exp, B);
	}
	@Test
	public void possibleValuesTest_2() 
	{
		int[] C = c.possibleValuesToArray();
		int[] exp = {};
		assertArrayEquals(exp, C);
	}
	
	//**********************************
	// existence
	//**********************************
	
	@Test
	public void existenceTest_0() 
	{	
		assertEquals(true, a.isExist(1));
	}
	@Test
	public void existenceTest_1() 
	{	
		assertEquals(true, a.isExist(2));
	}
	@Test
	public void existenceTest_2() 
	{	
		assertEquals(true, a.isExist(3));
	}
	@Test
	public void existenceTest_3() 
	{	
		assertEquals(false, a.isExist(0));
	}
	@Test
	public void existenceTest_4() 
	{	
		assertEquals(false, a.isExist(11));
	}
	@Test
	public void existenceTest_5() 
	{	
		assertEquals(false, b.isExist(0));
	}
	@Test
	public void existenceTest_6() 
	{	
		assertEquals(false, b.isExist(11));
		
	}
	@Test
	public void existenceTest_7() 
	{	
		assertEquals(true, b.isExist(5));
	}
	@Test
	public void existenceTest_8() 
	{	
		assertEquals(true, b.isExist(7));
	}
	@Test
	public void existenceTest_9() 
	{	
		assertEquals(true, b.isExist(9));
	}
	@Test
	public void existenceTest_10() 
	{	
		assertEquals(true, b.isExist(1));
	}
	@Test
	public void existenceTest_11() 
	{	
		assertEquals(false, c.isExist(0));
	}
	@Test
	public void existenceTest_12() 
	{	
		assertEquals(false, c.isExist(11));
		
	}
	@Test
	public void existenceTest_13() 
	{	
		assertEquals(false, c.isExist(2));
	}
	@Test
	public void existenceTest_14() 
	{	
		assertEquals(false, c.isExist(0));
	}
	@Test
	public void existenceTest_15() 
	{	
		assertEquals(false, c.isExist(19));
	}
	@Test
	public void existenceTest_16() 
	{	
		assertEquals(false, c.isExist(1));
	}
	
	//**********************************
	// removing
	//**********************************
	
	@Test
	public void removingTest_0() 
	{	
		a.remove(1);
		int[] values = a.possibleValuesToArray();
		int[] exp = {2,3,4,5,6,7,8,9};
		assertArrayEquals(values, exp);
	}
	@Test
	public void removingTest_1() 
	{	
		a.remove(5);
		int[] values = a.possibleValuesToArray();
		int[] exp = {1,2,3,4,6,7,8,9};
		assertArrayEquals(values, exp);
	}
	@Test
	public void removingTest_2() 
	{	
		a.remove(9);
		int[] values = a.possibleValuesToArray();
		int[] exp = {1,2,3,4,5,6,7,8};
		assertArrayEquals(values, exp);
	}
	@Test
	public void removingTest_3() 
	{	
		a.remove(0);
		int[] values = a.possibleValuesToArray();
		int[] exp = {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(values, exp);
	}
	@Test
	public void removingTest_4() 
	{	
		a.remove(10);
		int[] values = a.possibleValuesToArray();
		int[] exp = {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(values, exp);
	}
	@Test
	public void removingTest_5() 
	{	
		a.remove(3);
		a.remove(7);
		int[] values = a.possibleValuesToArray();
		int[] exp = {1,2,4,5,6,8,9};
		assertArrayEquals(values, exp);
	}
	
	//**********************************
	// checking
	//**********************************
	
	@Test
	public void checkingTest_0() 
	{	
		a.remove(1);a.remove(2);a.remove(3);
		a.remove(4);a.remove(5);a.remove(6);
		a.remove(7);a.remove(8);
		
		int[] values = a.possibleValuesToArray();
		int[] exp = {};
		assertArrayEquals(values, exp);
	}
	@Test
	public void checkingTest_1() 
	{	
		a.remove(1);a.remove(2);a.remove(3);
		a.remove(4);a.remove(5);a.remove(6);
		a.remove(7);a.remove(8);
		
		int exp = 9;
		int value = a.getValue();
		assertEquals(value, exp);
	}
	@Test
	public void checkingTest_2() 
	{	
		a.remove(1);a.remove(9);a.remove(3);
		a.remove(4);a.remove(5);a.remove(6);
		a.remove(7);a.remove(8);
		
		int exp = 2;
		int value = a.getValue();
		assertEquals(value, exp);
	}
	@Test
	public void checkingTest_3() 
	{	
		a.remove(1);a.remove(9);a.remove(3);
		a.remove(4);a.remove(5);a.remove(6);
		a.remove(7);
		
		int exp = 0;
		int value = a.getValue();
		assertEquals(value, exp);
	}
}
