package com.corejava.strong;

public class factofadigitinforword 
{
	public static void main(String[] args)
	{
		int no=54;
		int copy=no;
		int div=1;
		while(no>0)
		{
			div=div*10;
			no=no/10;
		}
		System.out.println(no+" "+div);
		while(copy>0)
		{ 
			div=div/10;
			int rem=copy/div;
			int fact=1;
			for (int i = 1; i <=rem; i++) 
			{
				fact=fact*i;
			}
			System.out.println(rem+"------>"+fact);
			copy=copy%div;
		}
	}
}
