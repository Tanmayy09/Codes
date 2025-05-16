package com.Array;
import java.util.*;
public class Copying 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] ll = {4,3,2,7,8,3,2,1};
		int[] temp = new int[ll.length+1];
		//ArrayList<Integer> al = new ArrayList<>();
		//al.stream().distinct().mapToInt(Integer::intValue).toArray();
		//Arrays.fill(arr,-1);
		//System.out.println(Arrays.toString(arr));
		
		List<Integer> set = new ArrayList<>();
		for(int i=0; i<ll.length; i++)
		{
			temp[ll[i]] = ll[i];
		}
		System.out.println(Arrays.toString(temp));
		}
}
