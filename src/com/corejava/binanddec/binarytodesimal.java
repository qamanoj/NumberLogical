package com.corejava.binanddec;
import java.util.Scanner;
public class binarytodesimal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int dec=0;
		int mul=1;
		while(no>0)
		{
			int rem=no%10;
			dec=dec+rem*mul;
			mul=mul*2;
			no=no/10;
		}
		System.out.println(dec);
}
}
