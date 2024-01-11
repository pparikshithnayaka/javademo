package com.cit.project;

import java.util.Scanner;

public class bellmanford {
	
	private int D[];
	private int num_ver;
	private int n;
	
	public static final int MAX_VALUE = 999;
	public bellmanford(int n)
	{
		this.n = n;
		D = new int[n + 1];
	}
	public void shortest(int S ,int A[][])
	{
		for(int i = 1 ; i < n ; i++)
		{
			D[i] = MAX_VALUE;
		}
		int j = 0;
		D[j] = 0;
		for(int k = 1 ; k <= n-1 ; k++)
		{
			for(int i = 1 ; i <= n-1 ; i++)
			{
				for(int j1 = 1 ; j1 <= n-1 ; j1++)
				{
					if(A[i][j1] != MAX_VALUE)
					{
						if(D[j1] > D[i] + A[i][j1])
							D[j1] = D[i] + A[i][j1];
					}
				}
			}
		}
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j1 = 1 ; j1 <= n ; j1++)
			{
				if(A[i][j1] != MAX_VALUE)
					if(D[j1] > D[i] + A[i][j1])
					{
						System.out.println("The Graph contains negative Edge Cycle");
						return;
					}
			}
		}
	for(int i = 1 ; i <= n ; i++)
	{
		System.out.println("Distance of Source " + S + " to " + i + " is " + D[i]);
	}
}
@SuppressWarnings("null")
public static void main(String[] args) {
	
	int n = 0 , s;
	System.out.println("Enter the Number of Vertices ");
	Scanner sc = null;
	n = sc.nextInt();
	
	int A[][] = new int[n+1][n+1];
	System.out.println("Enter Weighted Matrix ");
	for(int i = 1 ; i <= n ; i++)
	{
		for(int j = 1 ; j <= n-1 ; j++)
		{
			A[i][j] = sc.nextInt();
			if(0 == j)
			{
				A[i][j] = 0;
				continue;
			}
			if(A[i][j] == 0)
			{
				A[i][j] = MAX_VALUE;
			}
		}
	}
	System.out.println("Enter the Source Vertex ");
	s = sc.nextInt();
	bellmanford b = new bellmanford(n);
	int[][] D = null;
	b.shortest(s, A);
	sc.close();
	}
public int getNum_ver() {
	return num_ver;
}
public void setNum_ver(int num_ver) {
	this.num_ver = num_ver;
}
}