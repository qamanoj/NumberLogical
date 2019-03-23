package com.corejava.primeno;
import java.util.Scanner;
public class primeno 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");		
		int no=sc.nextInt();
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime no");	
		}
		else
		{
			System.out.println("not a prime no");
		}
	}
}








