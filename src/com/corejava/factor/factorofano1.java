package com.corejava.factor;

public class factorofano1
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			int no=i;
			int sum=0;
			for(int j=1;j<=(no-1);j++)
			{
				if(no%j==0)
				{
					sum=sum+j;
				}
			}
			if(no==sum)
			{
				System.out.println(i+" perfect no");
			}
		}
	}
}
