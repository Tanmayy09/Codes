package com.Stack;
import java.util.*;
class Stack
{
	int top=-1;
	int n =10;
	int[] a = new int[n];
	void push(int data)
	{
		if(top==(n-1))
			System.out.println("overflow");
		else
		{
			top=top+1;
			int i =data;
			a[top]=i;
			System.out.println("inserted");
		}
	}
	
	void pop()
	{
		if(top==-1)
			System.out.println("Underflow");
		else
		{
			top=top-1;
			System.out.println("Deleted");
		}
	}
	void display()
	{
		if(top==-1)
			System.out.println("Please add value");
		else {
		for(int j=top; j>=0; j--)
			System.out.println(a[j]);}
	}
}
public class Stack_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		int data,n,m;
		do
		{
			System.out.println("Size of Array is 10 inbuilt");
			System.out.println("Press 1 to push element : press 2 to pop : press 3 to display");
			n = sc.nextInt();
			switch(n)
			{
				case 1 :
					System.out.println("Enter data");
					data=sc.nextInt();
					s.push(data);
					break;
				case 2 :
					s.pop();
					System.out.println("Successful");
				case 3 :
					s.display();
			}
			System.out.println("Press 0 to add more");
			m = sc.nextInt();
		}
		while(m==0);
		
		s.display();
	}
}
