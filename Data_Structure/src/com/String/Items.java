package com.String;
import java.util.*;
public class Items 
{
	static class Item
	{
		String name;
		int price;
		public Item(String name, int price) {
			this.name = name;
			this.price = price;
		}
	}
	static int countItems(Item[] list1, int m, Item[] list2, int n)
	{
		int count=0;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if((list1[i].name.compareTo(list2[j].name)==0 )&& (list1[i].price!=list2[j].price))
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Item list1[] = {new Item("apple", 60), new Item("bread", 20),
                new Item("wheat", 50), new Item("oil", 30)};
        Item list2[] = {new Item("milk", 20), new Item("bread", 15),
                new Item("wheat", 40), new Item("apple", 60)};
        
        int m = list1.length;
        int n = list2.length;
         
        System.out.print("Count = "+ countItems(list1, m, list2, n));  
	}
}
