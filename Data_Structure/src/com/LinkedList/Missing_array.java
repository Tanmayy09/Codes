package com.LinkedList;
import java.util.*;
public class Missing_array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=0; i<n; i++)
		{
			ll.add(sc.nextInt());
		}
		for(int i=1; i<n; i++)
		{
			if(i!=ll.get(i-1))
				System.out.print (i+" ");
		}
	}
}
