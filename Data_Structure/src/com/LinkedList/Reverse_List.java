package com.LinkedList;
import java.util.*;
public class Reverse_List 
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
		Node newnode = new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next = newnode;
			tail=newnode;
		}
	}
	
	Node revv(Node head)
	{
		if(head==null || head.next==null)
			return head;
		Node temp = head;
		Node last = null;
		Node prev = null;
		while(temp!=null)
		{
			last =temp.next;
			temp.next = prev;
			prev = temp;
			temp = last;
		}
		head = prev;
		return head;
	}
	public void display()
	{
		Node current = revv(head);
		if(current==null)
			return;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) 
	{
		Reverse_List rl = new Reverse_List();
		rl.add(0);
		rl.add(1);
		rl.add(2);
		rl.add(3);
		rl.display();
	}
}
