package com.LinkedList;
import java.util.*;
public class Intersection 
{
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static Node head, head1=null;
	public Node tail, tail1=null;
	
	public void add(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
		}
	}
	
	public void add1(int data)
	{
		Node newnode = new Node(data);
		if(head1==null)
		{
			head1=newnode;
			tail1=newnode;
		}
		else
		{
			tail1.next=newnode;
			tail1=newnode;
		}
	}
	public static int intersect()
	{
		Node temp =head;
		while(temp!=null)
		{
			Node temp1= head1;
			while(temp1!=null)
			{
				if(temp.data==temp1.data)
					return temp.data;
				temp1=temp1.next;
			}
			temp=temp.next;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Intersection l1 = new Intersection();
		Intersection l2 = new Intersection();
		for(int i=0 ;i <4; i++)
			l1.add(sc.nextInt());
		for(int i=0; i<3; i++)
			l2.add1(sc.nextInt());
		
		System.out.println(intersect());
	}
}