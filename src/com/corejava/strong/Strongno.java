package com.corejava.strong;
import java.util.Scanner;

public class Strongno 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int sum=0;
		int copy=no;
		while(no>0)
		{
			int fact=1;
			int rem=no%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println(copy+" is a strong no");	
		}
		else
		{
			System.out.println(copy+" is not a strong no");
		}
	}
}