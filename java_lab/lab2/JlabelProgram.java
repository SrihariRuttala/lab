import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JlabelProgram extends JFrame
{
	static JFrame f;
	static JLabel l;

	JlabelProgram()
	{}

	public static void main(String[] args)
	{
		f = new JFrame("label");
		l = new JLabel();

		l.setText("lable text");

		JPanel p = new JPanel();

		p.add(l);
		f.add(p);

		f.setSize(300,300);

		f.show();
	}
}