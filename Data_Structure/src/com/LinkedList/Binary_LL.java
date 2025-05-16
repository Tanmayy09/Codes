package com.LinkedList;
import java.util.*;
public class Binary_LL 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		LinkedList ll = new LinkedList<>();
		for(int i=0; i<k; i++)
		{
			String s = sc.next();
			int n = Integer.parseInt(s,2);			
			ll.add(n);
		}
		System.out.println(ll);
		
	}
}
