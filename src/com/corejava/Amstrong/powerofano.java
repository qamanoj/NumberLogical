package com.corejava.Amstrong;
import java.util.*;
public class powerofano 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int power=1;
        for(int i=1;i<=2;i++)
        {
        	power=power*no;
        }
        System.out.println(power);
	}
}
