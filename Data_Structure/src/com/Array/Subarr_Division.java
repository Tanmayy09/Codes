package com.Array;
import java.util.*;
public class Subarr_Division 
{
	static int SUB(int[] arr, int k)
	{
		int max= 0;
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			for(int j=i; j<arr.length; j++)
			{
				sum+=arr[j];
				if(sum%k==0)
					max = Math.max(max, j-i+1);
			}
		}
		
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		System.out.println(SUB(arr,k));
	}
}
