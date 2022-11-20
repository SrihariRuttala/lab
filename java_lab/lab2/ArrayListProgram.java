import java.io.*;
import java.util.*;

public class ArrayListProgram
{
	public static void main(String args[])
	{
		int n = 5;
		ArrayList<Integer> arr = new ArrayList<Integer>(n);

		System.out.println("Inserting into array");
		arr.add(1);
		arr.add(2);
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}

	}
}