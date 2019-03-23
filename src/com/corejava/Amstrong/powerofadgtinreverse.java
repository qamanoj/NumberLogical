package com.corejava.Amstrong;

public class powerofadgtinreverse 
{
	public static void main(String[] args)
	{
       int no=123;
       while(no>0)
       {
    	   int rem=no%10;
    	   int power=1;
    	   for(int i=1;i<=rem;i++)
    	   {
    		   power=power*rem;
    	   }
    	   System.out.println(rem+"------>"+power);
    	   no=no/10;
       }
	}
}
