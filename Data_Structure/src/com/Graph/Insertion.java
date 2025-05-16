package com.Graph;
import java.util.*;
public class Insertion 
{
	private LinkedList<Integer> adjacent[];
	public Insertion(int v)
	{
		adjacent = new LinkedList[v];
		for(int i=0; i<v; i++)
		{
			adjacent[i]=new LinkedList();
		}
	}
	void insertedges(int s,int d)
	{
		adjacent[s].add(d);
		adjacent[d].add(s);
		System.out.print(adjacent[d]);
		System.out.print(adjacent[s]);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
		Insertion g = new Insertion(v);
		System.out.println("enter data");
		for(int i=0; i<e; i++)
		{
			int s = sc.nextInt(); //source
			int d = sc.nextInt(); // destination
			g.insertedges(s,d);
		}
	}
}