package com.LinkedList;
import java.util.*;
public class Delete_Node 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next = null;
		}
	}
	public void delete(int key)
	{
		Node temp = head , prev=null;
		// if head isn't contain that key
		if(temp!=null && temp.data == key)
		{
			head=temp.next;
			return;
		}
		// searching element
		while(temp!=null && temp.data!=key)
		{
			prev = temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		
		// node delete
		prev.next = temp.next;
	}
	
	public void push(int newNode)
	{
		Node node = new Node(newNode);
		node.next = head;
		head = node;
	}
	public void printList()
	 {
		 Node tnode= head;
		 while(tnode!=null)
		 {
			 System.out.println(tnode+" ");
			 tnode = tnode.next;
		 }
	 }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of list");
		Delete_Node ll = new Delete_Node();
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			ll.push(sc.nextInt());
		}
		System.out.println("Enter node to delete");
		int x = sc.nextInt();
		ll.delete(x);
		ll.printList();
		
	}
}
