package com.org.testy;

public class ArrayMaxPossiblySum {

	int ArrayMaxPossiblySumResult(int[] inputArray, int k)
	{
		int s =0;
		int ma;
		
		for (int i = 0; i < k; i++)
		{
			s+= inputArray[i];
			ma = s;
			for(int i1 =k; i1<inputArray.length; i1++)
			{
				s+= inputArray[i1] -inputArray[i1-k];
				ma = Math.max(ma, s);
			}
			return ma;
		}
		return 0;
		
	}
}
