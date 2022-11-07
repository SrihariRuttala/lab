import java.util.*;
class addition
{
	int add_two_nums(int a, int b)
	{
		return a+b;
	}
}
public class classes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		addition add = new addition();
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("total = "+add.add_two_nums(a,b));
	}
}
