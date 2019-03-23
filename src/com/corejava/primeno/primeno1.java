package com.corejava.primeno;

public class primeno1
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			int no=i;
			int count=0;
			for(int j=1;j<=no;j++)
			{
				if(no%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(no +"prime no");	
			}
		}
		System.out.println("***********");
		for(int i=1;i<=100;i++)
		{
			int no=i;
			int count=0;
			for(int j=1;j<=no;j++)
			{
				if(no%j==0)
				{
					count++;
				}
			}
			if(count!=2)
			{
				System.out.println(no +" is not a prime no");	
			}
		}
	}
}
