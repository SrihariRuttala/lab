import java.util.*;
class addition
{
	int num1, num2;
	addition()
	{
		num1 = 10;
		num2 = 20;
	}
	addition(int a, int b)
	{
		num1 = a;
		num2 = b;
	}
	int add_two_numbers()
	{
		return num1+num2;
	}
}
public class overload_constructor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		addition add = new addition(1,2);
		addition add_num = new addition();
		System.out.println("sum = "+add.add_two_numbers()+" without parameter " + add_num.add_two_numbers());
	}
}