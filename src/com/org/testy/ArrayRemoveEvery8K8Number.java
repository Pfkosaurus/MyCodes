package com.org.testy;

public class ArrayRemoveEvery8K8Number {

	public int[] extractEachKth(int[] inputArray, int k)
	{
		int index = 0;
		int n = inputArray.length;
		int[] a = new int[n -(n/k)];
		for (int i = 0; i <n; i++)
		{
			if ((i+1)%k!=0)
			{
				a[index++] = inputArray[i];
			}
		}
		return a;
	}
}
