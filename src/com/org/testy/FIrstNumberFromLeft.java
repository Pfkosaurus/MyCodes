package com.org.testy;

public class FIrstNumberFromLeft {
	
	public char firstDigit(String input)
	{
		for (char c:input.toCharArray())
		{
			if (Character.isDigit(c))
			{
				return c;
			}
		}
		return 0;
	}

}
