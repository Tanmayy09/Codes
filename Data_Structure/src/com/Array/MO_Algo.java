package com.Array;
import java.util.*;
class Query
{
	int l,r;
	Query(int l, int r)
	{
		this.l=l;
		this.r=r;
	}
}
public class MO_Algo 
{
	static void PrintElement(int[] arr, ArrayList<Query> al, int m, int n)
	{
		for(int i=0; i<m; i++)
		{
			int l= al.get(i).l, r= al.get(i).r;
			int sum=0;
			for(int j=l; j<r; j++)
				sum+=arr[j];
			System.out.println("Sum of "+l+" and "+r+" is : "+sum);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		ArrayList<Query> al = new ArrayList<Query>();
		System.out.println("Enter query length and query element");
		int m = sc.nextInt();
		for(int i=0; i<m; i++)
			al.add(new Query(sc.nextInt(),sc.nextInt()));
		
		PrintElement(arr,al,m,n);
	}

}
