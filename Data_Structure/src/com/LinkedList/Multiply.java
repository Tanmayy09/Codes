package com.LinkedList;
import java.util.*;
public class Multiply 
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data= data;
			this.next=null;
		}
	}
	static long multiplyList(Node first, Node second)
	{
		long num1=0,num2=0;
		while(first!=null || second!=null)
		{
			if(first!=null)
			{
				num1 = num1*10 + first.data;
				first=first.next;
			}
			if(second!=null)
			{
				num2 = num2*10 + second.data;
				second= second.next;
			}
		}
		return num1*num2;
	}
	public static void main(String[] args) 
	{
		Node first = new Node(1);
		first.next = new Node(2);
		first.next.next= new Node(1);
		
		Node second = new Node(1);
		second.next = new Node(2);
		
		System.out.println(multiplyList(first,second));
	}
}
