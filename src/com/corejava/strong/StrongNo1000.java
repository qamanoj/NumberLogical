package com.corejava.strong;

public class StrongNo1000 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=1000;i++)
		{
			int no=i;
			int copy=no;
			int sum=0;
			while(no>0)
			{
				int fact=1;
				int rem=no%10;
				for(int j=1;j<=rem;j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				no=no/10;
			}
			if(copy==sum)
			{
				System.out.println(copy+" strong number");
			}
		}
		System.out.println("**********");
		for(int i=1;i<=1000;i++)
		{
			int no=i;
			int copy=no;
			int sum=0;
			while(no>0)
			{
				int fact=1;
				int rem=no%10;
				for(int j=1;j<=rem;j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				no=no/10;
			}
			if(copy!=sum)
			{
				System.out.println(copy+" not a strong number");
			}
		}
	}
}
