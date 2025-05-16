package com.LinkedList;
import java.util.*;
public class Sort_0_1_2 
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
	public void sort()
	{
		int count[] = {0,0,0};
		int i=0;
		Node ptr =head;
		if(ptr!=null)
		{
			count[ptr.data]++;
			ptr=ptr.next;
		}
		ptr=head;
		while(ptr!=null)
		{
			if(count[i]==0) {
				i++;}
			else
			{
				ptr.data=i;
				--count[i];
				ptr=ptr.next;
			}
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
		Sort_0_1_2 so = new Sort_0_1_2();
		so.add(0);
		so.add(1);
		so.add(0);
		so.add(2);
		so.add(0);
		so.add(1);
		so.add(2);
		so.add(1);
		so.add(2);
		so.sort();
		so.display();
	}
}
