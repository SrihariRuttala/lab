interface one
{
	final int a = 10;
	void printOne();
}
interface two 
{
	void printTwo();
}
interface three extends one,two
{
	void printThree();
}
class hello_interfaces implements three
{
	public void printOne()
	{
		System.out.println("One variable = "+ a);
	}
	public void printTwo()
	{
		System.out.println("Two");
	}
	public void printThree()
	{
		System.out.println("Three");
	}
}
public class interfaces
{
	public static void main(String args[])
	{
		hello_interfaces obj = new hello_interfaces();
		obj.printOne();
		obj.printTwo();
		obj.printThree();
	}
}