package com.LinkedList;
import java.util.*;
public class Last_occ 
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
	public Node head=null;
	public Node tail=null;
	
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display()
	{
		Node current = head;
		if(head==null)
		{
			return;
		}
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	public static void main(String[] args) 
	{
		Last_occ list = new Last_occ();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		list.display();
	}
}
