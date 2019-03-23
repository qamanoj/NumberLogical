package com.corejava.fibonacisearies;

import java.util.Scanner;

public class fibonacciseries
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int f1=0;
		int f2=1;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1;i<=no;i++)
		{
			int f3=f1+f2;	
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}

