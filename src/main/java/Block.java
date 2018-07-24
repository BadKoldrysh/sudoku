public class Block
{
	private Cell[][] block;
	
	public Block()
	{
		this.block = new Cell[9][9];
		for (int i= 0, n = block.length; i < n; i++)
		{
			for (int j = 0, m = block[i].length; j < m; j++)
			{
				block[i][j] = new Cell();
			}
		}
	}
	
	public Block(int[][] arr)
	{
		this.block = new Cell[9][9];
		for (int i= 0, n = block.length; i < n; i++)
		{
			for (int j = 0, m = block[i].length; j < m; j++)
			{
				block[i][j] = new Cell(arr[i][j]);
			}
		}
	}
	
	public void solveSudoku()
	{
		boolean status = true;
		while (status)
		{
			status = false;
			
			for (int i = 0; i < 9; i++)
			{
				for (int j = 0; j < 9; j++)
				{
					if (!this.getCell(i, j).getFull())
					{
						status = true;

						this.toFindIVInSquare(i, j);
						this.toFindIVInHorizontal(i, j);
						this.toFindIVInVertical(i, j);
					}
				}
			}
			
			this.print();
		}
	}
	
	// IV - ImpossibleValues
	
	public void toFindIVInHorizontal(int x, int y)
	{
		if (block[x][y].getFull())
			return;
		for (int j = 0; j < 9; j++)
		{
			if (j == y)
				continue;
			else if (this.block[x][j].getValue() > 0)
			{
				this.block[x][y].remove(this.block[x][j].getValue());
			}
		}
	}
	
	public void toFindIVInVertical(int x, int y)
	{
		if (block[x][y].getFull())
			return;
		for (int i = 0; i < 9; i++)
		{
			if (i == x)
				continue;
			else if (this.block[i][y].getValue() > 0)
			{
				this.block[x][y].remove(this.block[i][y].getValue());
			}
		}
	}
	
	public void toFindIVInSquare(int x, int y)
	{
		if (block[x][y].getFull())
			return;
		if (x < 3 && y < 3)
		{
			this.searchInSquare(x, y, 3, 3);
		}
		else if (x < 3 && y >= 3 && y < 6)
		{
			this.searchInSquare(x, y, 3, 6);
		}
		else if (x < 3 && y >= 6 && y < 9)
		{
			this.searchInSquare(x, y, 3, 9);
		}
		else if (x >= 3 && x < 6 && y < 3)
		{
			this.searchInSquare(x, y, 6, 3);
		}
		else if (x >= 3 && x < 6 && y >= 3 && y < 6)
		{
			this.searchInSquare(x, y, 6, 6);
		}
		else if (x >= 3 && x < 6 && y >= 6 && y < 9)
		{
			this.searchInSquare(x, y, 6, 9);
		}
		else if (x >= 6 && x < 9 && y < 3)
		{
			this.searchInSquare(x, y, 9, 3);
		}
		else if (x >= 6 && x < 9 && y >= 3 && y < 6)
		{
			this.searchInSquare(x, y, 9, 6);
		}
		else if (x >= 6 && x < 9 && y >= 6 && y < 9)
		{
			this.searchInSquare(x, y, 9, 9);
		}	
	}
	
	private void searchInSquare(int x, int y, int n, int m)
	{
		for (int i = n-3; i < n; i++)
		{
			for (int j = m-3; j < m; j++)
			{
				if (i == x && j == y)
					continue;
				else if (this.block[i][j].getValue() > 0)
				{
					this.block[x][y].remove(this.block[i][j].getValue());
				}
			}
		}

	}
	
	public int[][] toArray()
	{
		int[][] arr = new int[9][9];
		for (int i= 0, n = block.length; i < n; i++)
		{
			for (int j = 0, m = block[i].length; j < m; j++)
			{
				arr[i][j] = block[i][j].getValue();
			}
		}
		return arr;
	}
	
	public void print()
	{
		int[][] arr = this.toArray();
		MainTest.show(arr);
	}
	
	public Cell getCell(int x, int y)
	{
		return this.block[x][y];
	}
	
}
