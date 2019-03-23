package Withoutusinglooping;

public class Program2 
{
	public static void main(String[] args)
	{
		int count=1234;
		method(count);
	}
	static void method(int count)
	{
		if(count>0)
		{
			int rem=count%10;
			System.out.print(rem);
			count=count/10;
			method(count);
		}
	}
}
