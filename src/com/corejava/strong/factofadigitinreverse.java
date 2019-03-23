package com.corejava.strong;

import java.util.Scanner;

public class factofadigitinreverse 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		while(no>0)
		{
			int fact=1;
			int rem=no%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			System.out.println(rem+"---->"+fact);
			no=no/10;
		}
	}
}
