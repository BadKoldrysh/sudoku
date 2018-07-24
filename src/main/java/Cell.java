import java.util.*;

public class Cell 
{
	private boolean full;
	private int value;
	private Vector<Integer> possibleValues = new Vector<>(); 
	
	public Cell()
	{
		this.full = false;
		this.value = 0;
		for (int i = 1; i < 10; i++)
			possibleValues.add(i);
	}
	
	public Cell(int value)
	{
		if (value == 0)
		{
			this.full = false;
			this.value = 0;
			for (int i = 1; i < 10; i++)
				possibleValues.add(i);
		}
		else if (value > 0 && value < 10)
		{
			this.full = true;
			this.value = value;
			/*
			for (int i = 1; i < 10; i++)
			{
				if (i == value)
					;
				else
					possibleValues.add(i);
			}
			*/
		}
	}
	
	private void valuesCheck()
	{
		if (this.possibleValues.size() == 1)
		{
			this.value = this.possibleValues.firstElement();
			possibleValues.remove(0);
			this.full = true;
		}
	}
	
	public int[] possibleValuesToArray()
	{
		int[] arr = new int[this.possibleValues.size()];
		for (int i = 0, n = arr.length; i < n; i++)
			arr[i] = possibleValues.get(i); 
		return arr;
	}
	
	public void remove(int value)
	{
		if (this.isExist(value))
			possibleValues.remove(new Integer(value));
		this.valuesCheck();
	}
	
	public boolean isExist(int value)
	{
		return this.possibleValues.contains(value);
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public boolean getFull()
	{
		return this.full;
	}
	
	public Vector getPossibleValues()
	{
		return this.possibleValues;
	}
	
	public void setValue(int value)
	{
		if (value >= 0 && value < 10)
			this.value = value;
	}
}
