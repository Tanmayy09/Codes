package com.Array;
import java.util.*;
public class _3Sum 
{
	static List<List<Integer>> Sum3(int[] arr)
	{
		Arrays.sort(arr);
		Set<List<Integer>> set = new HashSet<>();
		List<List<Integer>> al = new ArrayList<>();
		for(int i=0; i<arr.length; i++)
		{
			int j=i+1;
			int k = arr.length-1;
			while(j<k)
			{
				int sum = arr[i]+arr[j]+arr[k];
				if(sum==0)
				{	set.add(Arrays.asList(arr[i],arr[j],arr[k]));
					j++;
					k--;
				}
				else if(sum<0)
					j++;
				else
					k--;
			}
		}
		al.addAll(set);
		return al;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		System.out.println(Sum3(arr));
	}

}
