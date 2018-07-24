public class Main
{
	public static void main(String[] args)
	{
		int n = 9;
		int[][] A =    {{0,2,0, 6,0,8, 0,0,0},
						{5,8,0, 0,0,9, 7,0,0},
						{0,0,0, 0,4,0, 0,0,0},
						
						{3,7,0, 0,0,0, 5,0,0},
						{6,0,0, 0,0,0, 0,0,4},
						{0,0,8, 0,0,0, 0,1,3},
						
						{0,0,0, 0,2,0, 0,0,0},
						{0,0,9, 8,0,0, 0,3,6},
						{0,0,0, 3,0,6, 0,9,0}};	
		
		show(A);

		Block sudokuExample = new Block(A);
		sudokuExample.solveSudoku();
		show(sudokuExample.toArray());
	}
	
	public static void show(int[][] a)
	{
		System.out.println("_______________________________");
		for (int i = 0, n = a.length; i < n; i++)
		{
			for (int j = 0, m = a[i].length; j < m; j++)
			{
				if ((j) % 3 == 0)
					System.out.print("  ");
				if (a[i][j] == 0)
					System.out.print("_|");
				else
					System.out.print(a[i][j] + "|");
			}
			if ((i+1) % 3 == 0)
				System.out.println();
			System.out.println();
		}
	}
	
	public static void shw(int[] a)
	{
		for (int i = 0, n = a.length; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
