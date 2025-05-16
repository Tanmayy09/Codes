package com.Array;
import java.util.*;
public class subarray_withzero 
{
	public static boolean Subarray(int arr[])
	{
		Set<Integer> ss = new HashSet<>();
		ss.add(0);
		int sum=0;
		for(int val:arr)
		{
			sum+=val;
			if(ss.contains(sum))
				return true;
			ss.add(sum);
		}
		return false;
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
		if(Subarray(arr))
			System.out.println("Subarray exists");
		else
			System.out.println("Not exist");
			
	}
}
