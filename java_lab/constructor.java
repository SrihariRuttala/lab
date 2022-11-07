import java.util.*;
class addition
{
	int num1, num2;
	public addition(int a, int b)
	{
		num1 = a;
		num2 = b;
	}
	int add_two_numbers()
	{
		return (num1 + num2);
	}
}
public class constructor
{
	public static void main(String args[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		addition add = new addition(1,2);
		// System.out.println("Enter two numbers : ");
		// a = sc.nextInt();
		// b = sc.nextInt();
		System.out.println("Total = " + add.add_two_numbers());
	}
}