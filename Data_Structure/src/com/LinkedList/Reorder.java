package com.LinkedList;
import java.util.*;
public class Reorder 
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
	Node head,tail=null;
	public void push(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{	head=newnode; tail=newnode;}
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
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) 
	{
		Reorder ro = new Reorder();
		ro.push(1);
		ro.push(2);
		ro.push(3);
		ro.push(4);
		ro.display();
	}
}
