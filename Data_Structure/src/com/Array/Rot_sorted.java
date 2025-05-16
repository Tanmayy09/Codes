package com.Array;
import java.util.*;
public class Rot_sorted 
{
	static int Sor(int[] arr, int target)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		System.out.println(Sor(arr,target));
	}
}
