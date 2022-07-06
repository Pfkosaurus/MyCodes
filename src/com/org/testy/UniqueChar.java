package com.org.testy;

public class UniqueChar {
	
	public int  diffSymbol(String s)
	{
		return (int) s.chars().distinct().count();
	}

}
