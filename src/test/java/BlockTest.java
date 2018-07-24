//assertEquals(false, a.getFull());
//assertArrayEquals(exp, testA.toArray());

/*
 * nullBlock{}
 * {{0,0,0, 0,0,0, 0,0,0},
	{0,0,0, 0,0,0, 0,0,0},
	{0,0,0, 0,0,0, 0,0,0},
			
 	{0,0,0, 0,0,0, 0,0,0},
	{0,0,0, 0,0,0, 0,0,0},
	{0,0,0, 0,0,0, 0,0,0},
									
	{0,0,0, 0,0,0, 0,0,0},
	{0,0,0, 0,0,0, 0,0,0},
	{0,0,0, 0,0,0, 0,0,0}}
 */

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;



public class BlockTest 
{
	Block b = new Block();
	Block bb = new Block(new int[][]{{0,0,4, 0,8,0, 3,0,0},
									 {0,0,0, 0,0,3, 0,4,2},
									 {8,0,0, 4,0,5, 9,0,7},
									
									 {3,0,2, 0,7,0, 5,0,8},
								 	 {0,5,0, 0,0,0, 0,7,0},
								 	 {6,0,8, 0,9,0, 2,0,1},
									
									 {4,0,6, 2,0,7, 0,0,9},
									 {5,2,0, 9,0,0, 0,0,0},
									 {0,0,7, 0,1,0, 4,0,0}});
	
	//**********************************
	// constructor
	//**********************************
	@Test
	public void constructTest_0() 
	{	
		int[][] exp =  {{0,0,0, 0,0,0, 0,0,0},
						{0,0,0, 0,0,0, 0,0,0},
						{0,0,0, 0,0,0, 0,0,0},
								
					 	{0,0,0, 0,0,0, 0,0,0},
						{0,0,0, 0,0,0, 0,0,0},
						{0,0,0, 0,0,0, 0,0,0},
														
						{0,0,0, 0,0,0, 0,0,0},
						{0,0,0, 0,0,0, 0,0,0},
						{0,0,0, 0,0,0, 0,0,0}};
		assertArrayEquals(exp, b.toArray());
	}
	@Test
	public void constructTest_1() 
	{	
		int[][] exp =   {{0,0,4, 0,8,0, 3,0,0},
						 {0,0,0, 0,0,3, 0,4,2},
						 {8,0,0, 4,0,5, 9,0,7},
						
						 {3,0,2, 0,7,0, 5,0,8},
					 	 {0,5,0, 0,0,0, 0,7,0},
					 	 {6,0,8, 0,9,0, 2,0,1},
						
						 {4,0,6, 2,0,7, 0,0,9},
						 {5,2,0, 9,0,0, 0,0,0},
						 {0,0,7, 0,1,0, 4,0,0}};
		assertArrayEquals(exp, bb.toArray());
	}
	//**********************************
	// constructor - Exceptions
	//**********************************
	
	//**********************************
	// search impossible values in I square
	//**********************************	
	@Test
	public void searchingTest_00() 
	{	
		int x = 0, y = 0;
		int[] exp = {1,2,3,5,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_01() 
	{	
		int x = 0, y = 1;
		int[] exp = {1,2,3,5,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_22() 
	{	
		int x = 2, y = 2;
		int[] exp = {1,2,3,5,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_21() 
	{	
		int x = 2, y = 1;
		int[] exp = {1,2,3,5,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_10() 
	{	
		int x = 1, y = 0;
		int[] exp = {1,2,3,5,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_02() 
	{	
		int x = 0, y = 2;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_20() 
	{	
		int x = 2, y = 0;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	//**********************************
	// search impossible values in II square
	//**********************************	
	
	@Test
	public void searchingTest_03() 
	{	
		int x = 0, y = 3;
		int[] exp = {1,2,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_04() 
	{	
		int x = 0, y = 4;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_05() 
	{	
		int x = 0, y = 5;
		int[] exp = {1,2,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_13() 
	{	
		int x = 1, y = 3;
		int[] exp = {1,2,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_14() 
	{	
		int x = 1, y = 4;
		int[] exp = {1,2,6,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_25() 
	{	
		int x = 2, y = 5;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	//**********************************
	// search impossible values in III square
	//**********************************
	
	@Test
	public void searchingTest_07() 
	{	
		int x = 0, y = 7;
		int[] exp = {1,5,6,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_06() 
	{	
		int x = 0, y = 6;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_17() 
	{	
		int x = 1, y = 7;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_27() 
	{	
		int x = 2, y = 7;
		int[] exp = {1,5,6,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_28() 
	{	
		int x = 2, y = 8;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}

	//**********************************
	// search impossible values in IV square
	//**********************************
	
	@Test
	public void searchingTest_30() 
	{	
		int x = 3, y = 0;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_32() 
	{	
		int x = 3, y = 2;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_52() 
	{	
		int x = 5, y = 2;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_51() 
	{	
		int x = 5, y = 1;
		int[] exp = {1,4,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_42() 
	{	
		int x = 4, y = 2;
		int[] exp = {1,4,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_40() 
	{	
		int x = 4, y = 0;
		int[] exp = {1,4,7,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	//**********************************
	// search impossible values in V square
	//**********************************
	
	@Test
	public void searchingTest_33() 
	{	
		int x = 3, y = 3;
		int[] exp = {1,2,3,4,5,6,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_44() 
	{	
		int x = 4, y = 4;
		int[] exp = {1,2,3,4,5,6,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_55() 
	{	
		int x = 5, y = 5;
		int[] exp = {1,2,3,4,5,6,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_34() 
	{	
		int x = 3, y = 4;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_54() 
	{	
		int x = 5, y = 4;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}

	
	//**********************************
	// search impossible values in VI square
	//**********************************
	
	@Test
	public void searchingTest_36() 
	{	
		int x = 3, y = 6;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_47() 
	{	
		int x = 4, y = 7;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_58() 
	{	
		int x = 5, y = 8;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_37() 
	{	
		int x = 3, y = 7;
		int[] exp = {3,4,6,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_48() 
	{	
		int x = 4, y = 8;
		int[] exp = {3,4,6,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_57() 
	{	
		int x = 5, y = 7;
		int[] exp = {3,4,6,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	//**********************************
	// search impossible values in VII square
	//**********************************
	
	@Test
	public void searchingTest_61() 
	{	
		int x = 6, y = 1;
		int[] exp = {1,3,8,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_80() 
	{	
		int x = 8, y = 0;
		int[] exp = {1,3,8,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_72() 
	{	
		int x = 7, y = 2;
		int[] exp = {1,3,8,9};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_60() 
	{	
		int x = 6, y = 0;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_70() 
	{	
		int x = 7, y = 0;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_82() 
	{	
		int x = 8, y = 2;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	
	//**********************************
	// search impossible values in VIII square
	//**********************************
	
	@Test
	public void searchingTest_63() 
	{	
		int x = 6, y = 3;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_73() 
	{	
		int x = 7, y = 3;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_84() 
	{	
		int x = 8, y = 4;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_64() 
	{	
		int x = 6, y = 4;
		int[] exp = {3,4,5,6,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_75() 
	{	
		int x = 7, y = 5;
		int[] exp = {3,4,5,6,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_83() 
	{	
		int x = 8, y = 3;
		int[] exp = {3,4,5,6,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	//**********************************
	// search impossible values in IX square
	//**********************************
	
	@Test
	public void searchingTest_66() 
	{	
		int x = 6, y = 6;
		int[] exp = {1,2,3,5,6,7,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_77() 
	{	
		int x = 7, y = 7;
		int[] exp = {1,2,3,5,6,7,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_88() 
	{	
		int x = 8, y = 8;
		int[] exp = {1,2,3,5,6,7,8};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_68() 
	{	
		int x = 6, y = 8;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_86() 
	{	
		int x = 8, y = 6;
		int[] exp = {};  
		bb.toFindIVInSquare(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	//**********************************
	// search impossible values in horizontal
	//**********************************
	
	@Test
	public void searchingTest_H00() 
	{	
		int x = 0, y = 0;
		int[] exp = {1,2,5,6,7,9};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H02() 
	{	
		int x = 0, y = 2;
		int[] exp = {};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H08() 
	{	
		int x = 0, y = 8;
		int[] exp = {1,2,5,6,7,9};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H12() 
	{	
		int x = 1, y = 2;
		int[] exp = {1,5,6,7,8,9};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H15() 
	{	
		int x = 1, y = 5;
		int[] exp = {};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H16() 
	{	
		int x = 1, y = 6;
		int[] exp = {1,5,6,7,8,9};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H44() 
	{	
		int x = 4, y = 4;
		int[] exp = {1,2,3,4,6,8,9};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H47() 
	{	
		int x = 4, y = 7;
		int[] exp = {};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H60() 
	{	
		int x = 6, y = 0;
		int[] exp = {};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H61() 
	{	
		int x = 6, y = 1;
		int[] exp = {1,3,5,8};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H67() 
	{	
		int x = 6, y = 7;
		int[] exp = {1,3,5,8};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_H88() 
	{	
		int x = 8, y = 8;
		int[] exp = {2,3,5,6,8,9};  
		bb.toFindIVInHorizontal(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	//**********************************
	// search impossible values in vertical
	//**********************************
	
	@Test
	public void searchingTest_V00() 
	{	
		int x = 0, y = 0;
		int[] exp = {1,2,7,9};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V60() 
	{	
		int x = 6, y = 0;
		int[] exp = {};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V12() 
	{	
		int x = 1, y = 2;
		int[] exp = {1,3,5,9};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V02() 
	{	
		int x = 0, y = 2;
		int[] exp = {};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V15() 
	{	
		int x = 1, y = 5;
		int[] exp = {};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V16() 
	{	
		int x = 1, y = 6;
		int[] exp = {1,6,7,8};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V44() 
	{	
		int x = 4, y = 4;
		int[] exp = {2,3,4,5,6};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V47() 
	{	
		int x = 4, y = 7;
		int[] exp = {};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}

	@Test
	public void searchingTest_V61() 
	{	
		int x = 6, y = 1;
		int[] exp = {1,3,4,6,7,8,9};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V67() 
	{	
		int x = 6, y = 7;
		int[] exp = {1,2,3,5,6,8,9};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V08() 
	{	
		int x = 0, y = 8;
		int[] exp = {3,4,5,6};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	@Test
	public void searchingTest_V88() 
	{	
		int x = 8, y = 8;
		int[] exp = {3,4,5,6};  
		bb.toFindIVInVertical(x, y);
		assertArrayEquals(exp, bb.getCell(x, y).possibleValuesToArray());
	}
	
	//**********************************
	// solving
	//**********************************
	@Test
	public void solving_0() 
	{	
		bb.solveSudoku();
		int[][] exp = 	{{2,1,4, 7,8,9, 3,5,6},
						 {7,9,5, 1,6,3, 8,4,2},
						 {8,6,3, 4,2,5, 9,1,7},
						
						 {3,4,2, 6,7,1, 5,9,8},
					 	 {1,5,9, 8,3,2, 6,7,4},
					 	 {6,7,8, 5,9,4, 2,3,1},
						
						 {4,3,6, 2,5,7, 1,8,9},
						 {5,2,1, 9,4,8, 7,6,3},
						 {9,8,7, 3,1,6, 4,2,5}};
		assertArrayEquals(bb.toArray(),exp);
	}
	@Test
	public void solving_1() 
	{	
		bb = new Block(
				new int[][]	{	{1,0,0, 9,0,4, 0,3,7},
								{0,0,7, 5,0,1, 2,0,4},
								{0,0,0, 0,3,0, 0,5,0},
										
							 	{7,0,0, 0,0,0, 0,6,5},
								{0,0,1, 2,0,6, 8,0,0},
								{3,9,0, 0,0,0, 0,0,2},
																
								{0,7,0, 0,2,0, 0,0,0},
								{6,0,9, 3,0,5, 7,0,0},
								{2,5,0, 1,0,8, 0,0,6}
							
		});
		bb.solveSudoku();
		int[][] exp = 	{{1,2,5, 9,8,4, 6,3,7},
						 {9,3,7, 5,6,1, 2,8,4},
						 {4,6,8, 7,3,2, 1,5,9},
								
					 	 {7,8,2, 4,1,3, 9,6,5},
						 {5,4,1, 2,9,6, 8,7,3},
						 {3,9,6, 8,5,7, 4,1,2},
						 								
						 {8,7,3, 6,2,9, 5,4,1},
						 {6,1,9, 3,4,5, 7,2,8},
						 {2,5,4, 1,7,8, 3,9,6}};
		assertArrayEquals(bb.toArray(),exp);
	}
	@Test
	public void solving_2() 
	{	
		bb = new Block(
				new int[][]	{	{0,1,0, 7,0,6, 0,5,9},
								{6,0,0, 3,0,9, 2,0,1},
								{0,0,0, 0,2,0, 7,0,0},
										
							 	{1,0,0, 0,0,0, 8,0,7},
								{0,6,0, 5,0,8, 0,4,0},
								{2,0,3, 0,0,0, 0,0,5},
																
								{0,0,1, 0,5,0, 0,0,0},
								{5,0,7, 6,0,4, 0,0,8},
								{8,3,0, 2,0,7, 0,1,0}
							
		});
		bb.solveSudoku();
		int[][] exp = 	{	{3,1,2, 7,8,6, 4,5,9},
							{6,7,5, 3,4,9, 2,8,1},
							{9,4,8, 1,2,5, 7,6,3},
									
						 	{1,5,4, 9,6,2, 8,3,7},
							{7,6,9, 5,3,8, 1,4,2},
							{2,8,3, 4,7,1, 6,9,5},
															
							{4,2,1, 8,5,3, 9,7,6},
							{5,9,7, 6,1,4, 3,2,8},
							{8,3,6, 2,9,7, 5,1,4}};
		assertArrayEquals(bb.toArray(),exp);
	}
}
