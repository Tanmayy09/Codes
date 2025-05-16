package com.Queue;
import java.util.*;
class queue2
{
	int front=-1;
	int rear =-1;
	int n=10;
	int[] arr = new int[n];
	
	void insert(int data)
	{
		if(front==(rear+1)%n)
			System.out.println("Overflow");
		else
		{
			if(front==-1 && rear==-1)
			{
				front=front+1;
				rear=rear+1;
				arr[rear]=data;
			}
			else
			{
				rear+=1;
				arr[rear]=data;
			}
		}
	}
	void delete()
	{
		if(front==-1 && rear==-1)
			System.out.println("Underflow");
		else
			front=front+1;
	}
	
	void display()
	{
		int i;
		for(i=front; i!=rear; i=(i+1)%n)
			System.out.println(arr[i]);
		System.out.println(arr[i]);
	}
}
public class Circular_queue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		queue2 qa2 = new queue2();
		int data,n,m;
		do
		{
			System.out.println("Press 1 to enqueue : press 2 to dequeue");
			m = sc.nextInt();
			switch(m)
			{
				case 1 :
					System.out.println("Enter data");
					data=sc.nextInt();
					qa2.insert(data);
					break;
				case 2 :
					qa2.delete();
					break;
			}
			System.out.println("Press 0 add more");
			n = sc.nextInt();
		}
		while(n==0);
		qa2.display();
	}
}

