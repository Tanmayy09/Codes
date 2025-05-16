package com.Array;
import java.util.*;
public class ex5 
{
	/// binary sorting
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		LinkedList<Integer> aa = new LinkedList<>();
		for(int i=0 ; i<n; i++)
		{
			if(arr[i]==0)
				aa.addFirst(0);
			else
				aa.addLast(1);
		}
		System.out.println(aa);
	}
}
