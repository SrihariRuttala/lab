import java.util.*;
class swap
{
	void swap_two_numbers(refrence a, refrence b)
	{
		int temp;
		temp = a.a;
		a.a = b.b;
		b.b = temp;
	}
}
class refrence 
{
	int a, b;
}
public class value_refrence
{
	public static void main(String args[])
	{
		refrence a = new refrence();
		refrence b = new refrence();
		swap s = new swap();
		a.a = 10;
		b.b = 20;
		System.out.println("Before swapping : a = "+a.a+" b = "+b.b);
		s.swap_two_numbers(a,b);
		System.out.println("After swapping : a = "+a.a+" b = "+b.b);
		}
}