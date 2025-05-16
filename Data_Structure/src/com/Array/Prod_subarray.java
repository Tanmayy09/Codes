package com.Array;
import java.util.*;
public class Prod_subarray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
			arr[i]=sc.nextInt();
		int prod=1;
		int max=0;
		for(int i:arr)
		{
			prod = prod*i;
			if(prod>max)
				max=prod;
			if(prod<0)
				prod=1;
		}
		System.err.println(max);
	}

}
