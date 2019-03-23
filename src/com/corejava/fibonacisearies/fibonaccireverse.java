package com.corejava.fibonacisearies;

import java.util.Scanner;

public class fibonaccireverse 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int f1=0;
		int f2=1;
		System.out.print(f1);
		System.out.print(f2);
		for(int i=1;i<=4;i++)
		{
			int f3=f1+f2;	
			System.out.print(f3);
			f1=f2;
			f2=f3;
		}
		System.out.print("\t");
		System.out.print(f2);
		System.out.print(f1);
		for(int i=1;i<=4;i++)
		{
			int f3=f2-f1;
			System.out.print(f3);
			f2=f1;
			f1=f3;
		}
	}
}
