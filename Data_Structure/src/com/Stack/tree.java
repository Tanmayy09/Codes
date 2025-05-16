package com.Stack;
import java.util.*;
public class tree 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ss = new TreeSet<>();
		for(int i=0; i<6; i++)
		{
			ss.add(sc.nextInt());
		}
		System.out.println("Minimum"+ss.pollFirst());
		System.out.println("Maximum"+ss.pollLast());
	}
}
