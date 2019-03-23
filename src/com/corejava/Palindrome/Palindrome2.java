package com.corejava.Palindrome;

public class Palindrome2 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{	
			int no=i;
			int sum=0;
			int copy=no;
			while(no>0)
			{
				int rem=no%10;
				sum=sum*10+rem;
				no=no/10;
			}
			if(sum==copy)
			{
				System.out.println(copy+" is a palindrome");
			}
		}	
		System.out.println("	**************			");
		for(int i=1;i<=1000;i++)
		{	
			int no=i;
			int sum=0;
			int copy=no;
			while(no>0)
			{
				int rem=no%10;
				sum=sum*10+rem;
				no=no/10;
			}
			if(sum!=copy)
			{
				System.out.println(copy+" is not a palindrome");
			}
		}	
	}
}
