package com.Array;
import java.util.*;
public class ex4 
{
	// print subarray with sum zero
	public static void subarray(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				sum+=arr[j];
				if(sum==0)
					System.out.println(i+","+j);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		subarray(arr);
	}
}
