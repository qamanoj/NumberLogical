package com.corejava.factor;

import java.util.Scanner;

public class perfectno
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no-1;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
		{
			System.out.println("is perfect no");
		}
		else
		{
			System.out.println("not a perfect no");
		}


	}
}
