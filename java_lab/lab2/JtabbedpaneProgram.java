import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JtabbedpaneProgram
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("tabbed Pane");
		JTabbedPane tb = new JTabbedPane();
		JPanel p1, p2, p3;
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		tb.add("DS", p1);
		tb.add("CPP", p2);
		tb.add("C", p3);

		f.add(tb);
		f.setSize(300, 300);
		f.show();
	}
}