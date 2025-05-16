package com.Array;
import java.util.*;
public class Max_min 
{
	static int Min(int[] arr)
	{
		int less = Integer.MAX_VALUE;
		for(int i:arr)
			less =Math.min(less,i);
		return less;
	}
	static int Max(int[] arr)
	{
		int large=0;
		for(int i: arr)
			large = Math.max(i, large);
		return large;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		System.out.println("mini element "+Min(arr)+", max element "+Max(arr));
	}
}
