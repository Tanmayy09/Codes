package com.Queue;
import java.util.*;
public class Queue_Linkedlist 
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node front,rear=null;
	void insert(int data)
	{
		Node newnode = new Node(data);
		if(front ==null && rear==null)
		{
			front=newnode;
			rear=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
	}
	void delete()
	{
		if(front==null)
			System.out.println("empty");
		else
			front=front.next;
	}
	void display()
	{
		Node current = front;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("End");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Queue_Linkedlist qa = new Queue_Linkedlist();
		int data,m,n;
		do
		{
			System.out.println("Press 1 to enqueue : press 2 to dequeue");
			m = sc.nextInt();
			switch(m)
			{
				case 1 :
					System.out.println("Enter data");
					data=sc.nextInt();
					qa.insert(data);
					break;
				case 2 :
					qa.delete();
					break;
			}
			System.out.println("Press 0 add more");
			n = sc.nextInt();
		}
		while(n==0);
		qa.display();
	}
}
