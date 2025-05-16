package com.Array;
import java.util.*;
public class Product_except_self 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		int[] brr = new int[n];
		for(int i=0; i<n; i++)
		{
			int product =1;
			int j=0; 
			while(j<n)
			{
				if(j!=i)
					product=product*arr[j];
				j++;
			}
			brr[i]=product;
		}
		System.out.println(Arrays.toString(brr));
	}
}
