package com.Array;
import java.util.*;
public class choco_distri 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i=0; i+m-1<n; i++)
		{
			int diff = arr[i+m-1]-arr[i];
			min = Math.min(min, diff);
		}
		System.out.println(min);
	}

}
