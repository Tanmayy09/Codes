package com.Array;
import java.util.*;
public class Max_subarray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		int sum=0,max=0;
		for(int i :arr)
		{
			sum= sum+i;
			if(sum>max)
				max=sum;
			if(sum<0)
				sum=0;
		}
		System.out.println(max);
	}

}
