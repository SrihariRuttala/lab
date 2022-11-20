import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JscrollpaneProgram 
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("Scroll Pane");

		String categories[] = {"Geeks", "Language", "Java",
                               "Sudo Placement", "Python",
                               "CS Subject", "Operating System",
                               "Data Structure", "Algorithm",
                               "PHP language", "JAVASCRIPT",
                               "C Sharp" };

        JList l = new JList(categories);
		JScrollPane sp = new JScrollPane(l);
		JPanel p = new JPanel();

		p.add(sp);
		f.add(p);

		f.setSize(500,500);
		f.show();
	}
}