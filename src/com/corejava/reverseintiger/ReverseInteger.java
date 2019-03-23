package com.corejava.reverseintiger;

public class ReverseInteger 
{
	public static void main(String[] args)
	{
		int no=12345;
		int rev=0;
		while(no>0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		System.out.println("*********");
		while(no!=0)
		{
			rev=rev*10+no%10;
			no=no/10;
		}
		System.out.println(rev);
		System.out.println("*********");
		int no1=12345;
		System.out.println(new StringBuffer(String.valueOf(no1)).reverse());
	}
}
