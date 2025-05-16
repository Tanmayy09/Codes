package com.Stack;
import java.util.*;

class Stackarraylist
{
	int top=-1;
	ArrayList<Integer> al = new ArrayList<>();
	
	void push(int data)
	{
		top=top+1;
		al.add(data);	
		System.out.println("inserted");
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
		else
		{
			Collections.reverse(al);
			for(int i=top-1; i>=0; i++)
				System.out.println(al.get(i));
		}
	}
}

public class Stack_ArrayList 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stackarraylist s = new Stackarraylist();
		int data,n,m;
		do
		{
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
