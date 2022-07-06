
package com.org.testy;

public class PrefixJustDigits {
	
	public String prefix(String inputString)
	{
		return inputString.replaceAll("^(\\d*).*","$1");
	}

}
