package com.Array;
import java.util.*;
public class Repeat_Missing 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i:arr)
		{
			if(set.contains(i))
				al.add(i);
			else
				set.add(i);
		}
		for(int i=1; i<n; i++)
		{
			if(!set.contains(i))
				al.add(i);
		}
		System.out.println(al);
	}
}
