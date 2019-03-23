package com.corejava.highandlownoofadigt;

import java.util.Scanner;

public class Highestdgtinano 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int hd=0;
		while(no>0)
		{
			int rem=no%10;
			if(rem>hd)
			{
				hd=rem; 
			}
			no=no/10;
		}
		System.out.println(hd);
	}
}
