package com.LinkedList;
import java.util.*;
public class example 
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
	// making head and tail
	public Node head=null;
	public Node tail=null;
	
	//add value to node
	public void addNode(int data)
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
			tail = newNode;
		}
	}
	
	public int getlen()
	{
		int len=0;
		Node temp = head;
		while(temp!=null)
		{
			len++;
			temp=temp.next;
		}
		return len;
	}
	
	//display
	public void display()
	{
		Node current = head;
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		int len = getlen();
		int middle = len/2;
		while(middle!=0)
		{
			current = current.next;
			middle--;
		}
		System.out.println("middle is " +current.data);
}
	public static void main(String[] args) 
	{
		example list = new example();
		list.addNode(10);
		list.addNode(9);
		list.addNode(20);
		list.addNode(2);
		list.addNode(5);
		list.display();
	}
}
