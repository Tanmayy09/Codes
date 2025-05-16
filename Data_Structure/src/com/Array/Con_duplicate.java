package com.Array;
import java.util.*;
public class Con_duplicate 
{
	static boolean Dup(int[] arr)
	{
		Set<Integer> set = new HashSet<>();
		int c=0;
		for(int i: arr)
		{
			if(set.contains(i))
				c++;
			else
				set.add(i);
		}
		if(c>0)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		
		System.out.println(Dup(arr));
	}

}
