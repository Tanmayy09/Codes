package com.Queue;
import java.util.*;
class queue
{
	int front=-1;
	int rear=-1;
	int[] arr = new int[10];
	void insert(int data)
	{
		if(front==-1 && rear==-1)
		{
			front+=1;
			rear+=1;
			arr[rear]=data;
		}
		else
		{
			rear+=1;
			if(rear==arr.length)
				System.out.println("Full");
			else
				arr[rear]=data;
		}
	}
	void delete()
	{
		front+=1;
	}
	
	void display()
	{
		if(front==-1 && rear==-1)
			System.out.println("Empty");
		for(int i=rear; i>=front; i--)
			System.out.print(arr[i]+" ");
	}
}
public class Queue_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		queue qa = new queue();
		int data,m,n;
		do
		{
			System.out.println("Press 1 to enqueue : press 2 to dequeue");
			m = sc.nextInt();
			switch(m)
			{
				case 1 :
					System.out.println("Enter data");
					data=sc.nextInt();
					qa.insert(data);
					break;
				case 2 :
					qa.delete();
					break;
			}
			System.out.println("Press 0 add more");
			n = sc.nextInt();
		}
		while(n==0);
		qa.display();
	}
}
