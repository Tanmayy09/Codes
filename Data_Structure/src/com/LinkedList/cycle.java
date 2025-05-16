package com.LinkedList;
import java.util.*;
public class cycle 
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
	public Node head,tail=null;
	
	public void add(int data)
	{
		Node newnode = new Node(data);
		if(head==null && tail==null)
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
	
	public boolean cyc(Node head)
	{
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		
	}
}
