package com.corejava.strong;
import java.util.Scanner;
public class Factorialofano 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int fact=1;
		while(no>0)
		{
			fact=no*fact;
			no=no-1;
		}
		System.out.println(fact);
	}
}
