package com.LinkedList;
import java.util.*;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<String> ll = new LinkedList<>();
		for(int i=0; i<n; i++)
		{
			ll.add(sc.next());
		}
		String s ="", s1="";
		for(String i: ll)
		{
			s = s+i;
		}
		Collections.reverse(ll);
		for(String i : ll)
		{
			s1=s1+i;
		}
		if(s.equals(s1))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");
	}
}
