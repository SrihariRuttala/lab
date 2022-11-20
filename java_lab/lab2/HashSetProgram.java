import java.util.*;
import java.io.*;

public class HashSetProgram
{
	public static void main(String args[])
	{
		HashSet<ArrayList> set = new HashSet<>();
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		set.add(list1);
		System.out.println(set);
	}
}