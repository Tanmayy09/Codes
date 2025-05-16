package com.Array;
import java.util.*;
public class Reverse 
{	
	static int[] Rev(int[] ar, int n, int m)
	{
		if(n<m)
		{
			int temp = ar[n];
			ar[n]=ar[m];
			ar[m]=temp;
			Rev(ar,n+1,m-1);
		}
		return ar;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		int[] revarray = Rev(arr,0,n-1);
		for(int i: revarray)
			System.out.print(i+" ");
	}
}
