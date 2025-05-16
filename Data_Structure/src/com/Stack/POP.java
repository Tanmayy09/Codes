package com.Stack;
import java.util.*;
public class POP 
{
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static class stack{
		public static Node head;
		public static boolean isempty()
		{
			return head==null;
		}
		public static void push(int data)
		{
			Node newnode = new Node(data);
			if(head==null) {
				head=newnode;
				return;
			}
			newnode.next=head;
			head=newnode;
		}
		public static int pop()
		{
			if(isempty())
				return -1;
			int top = head.data;
			head=head.next;
			return top;
		}
		public static int peek()
		{
			if(isempty())
				return -1;
			return head.data;
		}
	}
	public static void main(String[] args) 
	{
		stack s = new stack();
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		while(!s.isempty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}
}
