public class Square 
{
	private Cell[][] block;
	
	public Square()
	{
		block = new Cell[3][3];
		for (int i = 0, n = block.length; i < n; i++)
		{
			for (int j = 0, m = block.length; j < m; j++)
			{
				block[i][j] = new Cell();
			}
		}
	}
}
