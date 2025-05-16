package com.String;
import java.util.*;
public class mobile_number 
{
	static String PrintNum(String[] arr, String n)
	{
		String num="";
		for(int i=0; i<n.length(); i++)
		{
			if(n.charAt(i)==' ')
				num=num+"0";
			else
			{
				int pos = n.charAt(i)-'A';
				num=num+arr[pos];
			}
		}
		return num;
	}	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] arr = {"2","22","222","3","33","333","4","44","444","5","55","555",
						"6","66","666","7","77","777","7777","8","88","888","9","99",
						"999","9999"," "};
		String word=sc.next();
		System.out.println(PrintNum(arr,word));
	}
}
