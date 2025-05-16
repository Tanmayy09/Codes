package com.Array;
import java.util.*;
public class Array_palindrome 
{
	static int Palin(int[] arr)
	{
		int ans=0;
		int i=0,j=arr.length-1;
		
		while(i<=j)
		{
			if(arr[i]==arr[j])
			{
				i++;j--;
			}
			else if(arr[i]>arr[j])
			{
				i++;
				arr[j]+=arr[j+1];
				ans++;
			}
			else
			{
				i++;
				arr[i]=arr[i-1];
				ans++;
			}
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		System.out.println(Palin(arr));
	}
}
