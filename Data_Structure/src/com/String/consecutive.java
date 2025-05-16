package com.String;
import java.util.*;
public class consecutive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t="";
		int j=0, i=0;
		while(j<s.length())
		{
			if(s.charAt(i)==s.charAt(j))
				j++;
			else if(s.charAt(i)!=s.charAt(j))
			{
				t=(t+s.charAt(i));
				i=j;
				j++;
			}
		}
		t=t+s.charAt(j-1);
		System.out.println(t);
	}

}
