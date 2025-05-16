package com.Array;
import java .util.*;
public class B_Search 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		System.out.println("Enter target value");
		int tar = sc.nextInt();
		System.out.println("Enter array element");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int left=0, right = arr.length-1;
		while(left<=right)
		{
			int middle = (left+right)/2;
			if(arr[middle]==tar)
			{	System.out.println(arr[middle]+"found at : "+middle);
				break;}
			else if(tar> arr[middle])
				left=middle+1;
			else
				right=middle-1;
		}
	}
}
