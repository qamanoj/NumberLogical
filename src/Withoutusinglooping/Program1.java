package Withoutusinglooping;

public class Program1 
{
	static int count=1;
	public static void main(String[] args)
	{
		method();
	}
	public static  void method()
	{
		if(count<=100)
		{
			System.out.println(count);
			count++;
			method();
		}
	}
}
