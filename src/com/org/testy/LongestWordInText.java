package com.org.testy;

import java.util.Arrays;

public class LongestWordInText {
	public String word(String inputString)
	{
		return Arrays.stream(inputString.split("\\W+")).max((a,b) -> a.length() - b.length()).get();
	}

}
