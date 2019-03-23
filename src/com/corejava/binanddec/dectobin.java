package com.corejava.binanddec;

import java.util.Scanner;

public class dectobin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int bin=0;
		int mul=1;
		int copy=no;
		while(no>0)
		{
			int rem=no%2;
			bin=bin+rem*mul;
			mul=mul*10;
			no=no/2;			
		}
		System.out.println(copy+"---->"+bin);
}
}
