package com.String;
import java.util.*;
public class IP_Address 
{
	public static String address(String s)
	{
		String defang ="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='.')
				defang = defang+"[.]";
			else
				defang = defang + s.charAt(i);
		}
		return defang;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(address(s));
	}
}
