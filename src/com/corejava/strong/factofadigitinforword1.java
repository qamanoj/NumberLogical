package com.corejava.strong;
public class factofadigitinforword1 
{
	public static void main(String[] args)
	{
		int no=345;
		int reverse=0;
		while(no>0)
		{
			int rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		while(reverse>0)
		{
			int rem=reverse%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			System.out.println(rem+"---->"+fact);		
			reverse=reverse/10;
		}
	}
}
