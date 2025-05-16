package com.LinkedList;
import java.util.*;

public class Deletion 
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
	Node head=null;
	//-------------------------//
	void insert()
	{
		int data,n,p,m;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter data");
			data=sc.nextInt();
			Node newnode = new Node(data);
			if(head==null)
				head=newnode;
			else
			{
				System.out.println("press 1 for insert at begining : press 2 for inert at end : press 3 for insert at specific position");
				n =sc.nextInt();
				switch(n)
				{
					case 1 :
						newnode.next=head;
						head=newnode;
						break;
					case 2 :
						Node tail =head;
						while(tail.next!=null)
							tail=tail.next;
						tail.next=newnode;
						break;
					case 3 :
						System.out.println("Enter position");
						p=sc.nextInt();
						Node temp1=head;
						for(int i=0; i<p-2; i++)
							temp1=temp1.next;
						newnode.next=temp1.next;
						temp1.next=newnode;
						break;
				}
			}
			System.out.println("Press 7 for add more elements");
			m = sc.nextInt();
		}
		while(m==7);
	}
	
	//-------------------//
	 void Delete()
	{
		int data, n,m,p;
		Scanner sc = new Scanner(System.in);
		do
		{
			if(head==null)
				System.out.println("List is empty");
			else
			{
				System.out.println("press 1 for delete begining : press 2 to delete end : press 3 for specific position");
				m =sc.nextInt();
				switch(m)
				{
					case 1 :
						Node temp =head;
						temp=temp.next;
						head=temp;
						break;
					case 2 :
						Node temp1=head;
						Node ptr1 =temp1.next;
						while(ptr1.next!=null)
						{
							temp1=ptr1;
							ptr1=ptr1.next;
						}
						temp1.next=null;
						break;
					case 3 :
						System.out.println("Enter position");
						p = sc.nextInt();
						Node temp2= head;
						Node ptr2 = temp2.next;
						for(int i=0; i<p-2; i++)
						{
							temp2=ptr2;
							ptr2=ptr2.next;
						}
						temp2.next=ptr2.next;
						break;
				}
			}
			System.out.println("Press 1 to delete more");
			n = sc.nextInt();
		}
		while(n==1);
	}
	 
	 //--------------------------------//
	 void display()
	{
		Node current = head;
		if(current ==null)
			System.out.println("list is empty");
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("End");
	}
	//--------------------------//
	public static void main(String[] args) 
	{
		Deletion dl = new Deletion();
		dl.insert();
		dl.Delete();
		dl.display();
	}
}
