package com.Array;
import java.util.*;
public class left_Rotate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first=0;
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		first = arr[0];
		for(int i=0; i<n-1; i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=first;
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
