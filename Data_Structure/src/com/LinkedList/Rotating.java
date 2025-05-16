package com.LinkedList;
import java.util.*;
public class Rotating 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void rotate(int k)
	{
		Node temp =head;
		Node last = head;
		if(head==null || k==0)
			return;
		
		while(last.next!=null)
		{
			last = last.next;
		}
		while(k!=0)
		{
			head=head.next;
			temp.next=null;
			last.next = temp;
			last = temp;
			temp=head;
			k--;
		}
	}
		void push(int new_data)
		{
			Node new_node = new Node(new_data);
			new_node.next= head;
			head = new_node;
		}
		void printList()
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.println(temp +" ");
				temp=temp.next;
			}
			System.out.println();
		}
	public static void main(String[] args) 
	{
		Rotating ll = new Rotating();
		for(int i = 60; i>=10; i-=10)
		{
			ll.push(i);
		}
		System.out.println(ll);
		ll.rotate(4);
		ll.printList();
	}
}
