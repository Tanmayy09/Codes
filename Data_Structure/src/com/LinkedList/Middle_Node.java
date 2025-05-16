package com.LinkedList;
import java.util.*;
public class Middle_Node 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList ll = new LinkedList<>();
		for(int i=0; i<n; i++)
		{
			ll.add(sc.nextInt());
		}
		if(n%2==0)
		{
			for(int i=(n/2)+1; i<=n; i++)
			{
				System.out.println(ll);
			}
		}
		else
		{
			for(int i=n/2; i<n; i++)
			{
				System.out.println(ll);
			}
		}
	}
}
