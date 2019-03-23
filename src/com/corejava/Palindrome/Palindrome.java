package com.corejava.Palindrome;
import java.util.Scanner;
public class Palindrome
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
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println(copy+" "+"is a palindrome");
		}
		else
		{
			System.out.println(copy+"is not a palindrome");	
		}

	}
}
