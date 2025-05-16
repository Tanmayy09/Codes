package com.String;
import java.util.*;
public class Print_Duplicate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Map<Character, Integer> count = new HashMap<>();
		for(int i=0; i<s.length(); i++)
		{
			if(count.containsKey(s.charAt(i)))
				count.put(s.charAt(i), count.get(s.charAt(i))+1);
			else
				count.put(s.charAt(i),1);
		}
		for(Map.Entry<Character, Integer> map: count.entrySet())
		{
			if(map.getValue()>1)
				System.out.println(map.getKey()+" -counted as: "+map.getValue());
		}
	}

}
