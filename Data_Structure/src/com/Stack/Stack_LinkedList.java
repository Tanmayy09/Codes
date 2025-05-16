package com.Stack;
import java.util.*;
public class Stack_LinkedList 
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
	Node top=null;
	void push(int data)
	{
		Node newnode = new Node(data);
		if(top==null)
			top=newnode;
		else
		{
			newnode.next=top;
			top=newnode;
		}
	}
	void pop()
	{
		if(top==null)
			System.out.println("Stack is Empty");
		else
			top=top.next;
	}
	void display()
	{
		Node current = top;
		if(top==null)
			System.out.println("Empty");
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
		Stack_LinkedList sl = new Stack_LinkedList();
		int data,n,m;
		do
		{
			System.out.println("Press 1 to push : press 2 to pop");
			n = sc.nextInt();
			switch(n)
			{
				case 1 :
					System.out.println("Enter data");
					data=sc.nextInt();
					sl.push(data);
					break;
				case 2 :
					sl.pop();
 			}
			System.out.println("Press 0 to add more");
			m = sc.nextInt();
		}
		while(m==0);
		sl.display();
	}
}
