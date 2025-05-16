package com.LinkedList;
import java.util.*;
public class rotright 
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
	void rotate(int k)
	{
		Node temp= head;
		Node last = head;
		if(head==null || k==0)
		{
			return;
		}
		while(last.next!=null)
		{
			last=last.next;
		}
		while(k!=0) {
			head=head.next;
			temp.next=null;
			last.next=temp;
			last=temp;
			temp=head;
			k--;
		}
	}
	
	public void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) 
	{
		rotright list = new rotright();
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(2);
		list.rotate(2);
		list.display();
	}
}
