package com.Array;
import java.util.*;
public class pair 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter target value");
		int x = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(x==(arr[i]+arr[j]))
					System.out.println("pair found :"+ arr[i]+","+ arr[j]);
			}
		}
	}
}
