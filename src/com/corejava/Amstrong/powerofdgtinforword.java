package com.corejava.Amstrong;

public class powerofdgtinforword 
{
	public static void main(String[] args) 
	{
      int no=123;
      int reverse=0;
      while(no>0)
      {
    	  int rem=no%10;
    	  reverse=reverse*10+rem;
    	  no=no/10;
      }
      //System.out.println(reverse);//reverse=321
      while(reverse>0)
      {
    	  int power=1;
    	  int rem=reverse%10;
    	  for(int i=1;i<=rem;i++)
    	  {
    		  power=power*rem;
    	  }
    	  System.out.println(rem+"---->"+power);
    	  reverse=reverse/10;
      }
	}
}
