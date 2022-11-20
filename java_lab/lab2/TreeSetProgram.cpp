import java.util.*;
import java.io.*;

public class TreeSetProgram
{
	public static void main(String args[])
	{
		NavigableSet<String> ts = new TreeSet<>();

		ts.add("Geeks");
		ts.add("For");
		ts.add("Geeks");
		System.out.println(ts);
	}
}