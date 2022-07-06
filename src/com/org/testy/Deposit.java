package com.org.testy;

public class Deposit 
{
	public float deposit;
	public float sum = deposit;
	public int count = 0;
	public int treshold;
	public int rate;
	
	public int getCount()
	{
		while (sum<treshold)
		{
			sum+=sum*(rate/100);
			count++;
		}
		return count;
	}
}
