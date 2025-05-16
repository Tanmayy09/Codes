package com.LinkedList;
import java.util.*;
public class Adding_two 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList<>();
		LinkedList l2 = new LinkedList<>();
		LinkedList l3 = new LinkedList<>();
		ll.add(9); ll.add(9); ll.add(9); ll.add(9); ll.add(9);
		ll.add(9);
		ll.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		Collections.reverse(ll);
		Collections.reverse(l2);
		String s1="" , s2="";
		for(int i=0; i<ll.size(); i++)
		{
			s1=s1+ll.get(i);
		}
		for(int i=0; i<l2.size(); i++)
		{
			s2=s2+l2.get(i);
		}
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int sum = n1+n2;
		String s3 = Integer.toString(sum);
		for(int i=0; i<s3.length(); i++)
		{
			l3.add(s3.charAt(i));
		}
		Collections.reverse(l3);
		System.out.println(l3);
	}
}
