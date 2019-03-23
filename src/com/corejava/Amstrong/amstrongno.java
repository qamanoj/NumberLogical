package com.corejava.Amstrong;
public class amstrongno 
{
	public static void main(String[] args)
	{
		int no=153;
		int copy=no;
		int copy1=no;
		int count=0;
		int sum=0;
		while(no>0)
		{
			count++;
			no=no/10;
		}
		//System.out.println(no+"  "+count);
		while(copy>0)
		{
			int power=1;
			int rem=copy%10;
			for(int i=1;i<=count;i++)
			{
				power=power*rem;

			}
			sum=sum+power;
			copy=copy/10;
		}
		if(copy1==sum)
		{
			System.out.println(copy1+" number is amstrong");
		}
		else
		{
			System.out.println(copy1+" number is not a amstrong");
		}
	}
}
