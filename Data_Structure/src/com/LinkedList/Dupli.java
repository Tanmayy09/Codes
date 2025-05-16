package com.LinkedList;
import java.util.*;
public class Dupli 
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
	public void remov()
	{
		HashSet<Integer> set = new HashSet<>();
		Node curr = head;
		Node prev = null;
		 while(curr.next!=null)
		 {
			 int curval = curr.data;
			 if(set.contains(curval))
			 {
				 prev.next=curr.next;
			 }
			 else
			 {
				 set.add(curval);
				 prev=curr;
			 }
			 curr=curr.next;
		 }
	}
	public void display()
	{
		Node current = head;
		while(current.next!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) 
	{
		Dupli dup = new Dupli();
		dup.add(0);
		dup.add(2);
		dup.add(1);
		dup.add(2);
		dup.add(3);
		dup.add(4);
		dup.add(3);
		dup.display();
		System.out.println();
		dup.remov();
		dup.display();
	}
}
