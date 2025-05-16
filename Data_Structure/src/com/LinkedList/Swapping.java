package com.LinkedList;
import java.util.*;
public class Swapping 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s=0 , t=0;
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		for(int i=0; i<n; i++)
		{
			ll.add(sc.nextInt());
		}
		System.out.println(ll);
		l2.addAll(ll);
		for(int i=k; i<=k; i++)
		{
			s = ll.get(n-k);
			ll.add(i,s);
		}
		for(int i=n-k; i<n-k; i++)
		{
			t = l2.get(k);
			l2.add(i, t);
		}
		System.out.println(l2);
	}
}
