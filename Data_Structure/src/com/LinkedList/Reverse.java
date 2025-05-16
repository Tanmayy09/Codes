package com.LinkedList;
import java.util.*;
public class Reverse 
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
	
	Node rev(Node head)
	{
		if(head==null || head.next==null)
			return head;
		Node curr =head;
		Node prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		return prev;
	}
	public void display()
	{
		Node pre=rev(head);
		if(pre==null)
			return;
		while(pre!=null)
		{
			System.out.print(pre.data+" ");
			pre=pre.next;
		}
	}
	public static void main(String[] args) 
	{
		Reverse list = new Reverse();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.display();
		List<List<Integer>> s = new ArrayList<>();
		s.add(Arrays.asList(1,1,1));
		LinkedList<Integer> l = new LinkedList<>();
		l.add(null);
		System.out.println(s);
	}
}
