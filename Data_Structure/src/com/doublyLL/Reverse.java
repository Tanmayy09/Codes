package com.doublyLL;
import java.util.*;
public class Reverse 
{
	private Node head,tail;
	
	public void insert(int val)
	{
		Node newnode = new Node(val);
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
	
	public void display()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.val+"-->");
			current=current.next;
		}
		System.out.print("END");
	}
	private class Node
	{
		int val;
		Node next;
		Node prev;
		
		public Node(int val)
		{
			this.val=val;
		}
		public Node(int val, Node next, Node prev)
		{
			this.val=val;
			this.next=null;
			this.prev=null;
		}
	}
	
	public static void main(String[] args) 
	{
		Reverse rev = new Reverse();
		rev.insert(1);
		rev.insert(2);
		rev.insert(3);
		rev.insert(4);
		rev.display();
	}
}
