package com.LinkedList;
import java.util.*;
public class Nth_node 
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
	public Node head =null;
	public Node tail = null;
	
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
	void nth(int k)
	{
		Node temp =head;
		int len=0;
		if(head==null || k==0)
			return ;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		if(len<k)
			return;
		
		temp=head;
		for(int i=1; i<len-k+1; i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Nth_node list = new Nth_node();
		for(int i=0; i<4; i++)
		{
			list.add(sc.nextInt());
		}
		list.nth(4);
	}
}
