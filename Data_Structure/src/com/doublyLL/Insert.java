package com.doublyLL;
import java.util.*;
public class Insert 
{
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	Node head,tail=null;
	
	void insertFirst(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;;
		}
		
	}
	void insertLast(int data)
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
			newnode.prev=tail;
			tail=newnode;;
		}
	}
	
	void display()
	{
		Node current = head;
		if(tail==null)
			System.out.println("List is empty");
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("End");
	}
	public static void main(String[] args) 
	{
		Insert il = new Insert();
		Scanner sc = new Scanner(System.in);
		int data,n,m,p;
		do
		{
			System.out.println("Press 1 or insert First : press 2 for insert last");
			n = sc.nextInt();
			System.out.println("Enter data");
			data=sc.nextInt();
			switch(n)
			{
				case 1 :
					il.insertFirst(data);
					break;
				case 2 :
					il.insertLast(data);
					break;
			}
			System.out.println("Press 1 or more");
			m = sc.nextInt();
		}
		while(m==1);
		
		il.display();
	}
}