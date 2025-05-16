package com.Matrix;
import java.util.*;
public class Multiply 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int[][] brr = new int[n][m];
		int[][] crr = new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				brr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				for(int k=0; k<n; k++)
				{
					crr[i][j]=arr[i][k]*brr[k][j];
					System.out.print(crr[i][j] + " ");
				}
			}
		}
	}
}