package com.Array;
import java.util.*;
public class Sum_rotat 
{
	static boolean Yes(int[] arr,int x)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==x)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		System.out.println(Yes(arr,x));
	}
}
