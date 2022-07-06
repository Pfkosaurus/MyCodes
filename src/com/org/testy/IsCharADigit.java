package com.org.testy;

public class IsCharADigit {
	public boolean isDigitThisChar(char symbol) 
	{
		 
		String symbolString = String.valueOf(symbol);
		return symbolString.matches("^([0-9])$");
	}

}
