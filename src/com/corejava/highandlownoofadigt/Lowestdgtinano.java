package com.corejava.highandlownoofadigt;

import java.util.Scanner;

public class Lowestdgtinano
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int sd=9;
		while(no>0)
		{
			int rem=no%10;
			if(rem<sd)
			{
				sd=rem;
			}
			no=no/10;
		}
		System.out.println(sd);
	}

}
