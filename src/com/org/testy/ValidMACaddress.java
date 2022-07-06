package com.org.testy;

public class ValidMACaddress {
	
	boolean isValidMAC(String inputString)
	{
		return inputString.matches("^([0-9A-F][-||-]-){5}[0-9A-F][0-9A-F]$");
		}

}
//[
