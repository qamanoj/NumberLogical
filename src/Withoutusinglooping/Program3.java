package Withoutusinglooping;

public class Program3 
{
	static int sum=0;
	public static void main(String[] args) 
	{
		int no=2345;
		method(no);
		System.out.println(sum);
	}
	static void method(int no)
	{
		if(no>0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
			method(no);
		}
	}
}
