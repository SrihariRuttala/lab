import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JradiobuttonProgram extends JFrame implements ItemListener
{
	static JFrame f;
	static JLabel l;
	public static void main(String args[])
	{
		JRadioButton rb1 = new JRadioButton("button1");
		JRadioButton rb2 = new JRadioButton("button2");
		l = new JLabel();
		JradiobuttonProgram jr = new JradiobuttonProgram();
		rb1.addItemListener(jr);
		rb2.addItemListener(jr);

		f = new JFrame("Radio buttons");
		JPanel p = new JPanel();

		p.add(rb1);
		p.add(rb2);
		p.add(l);

		f.add(p);
		f.setSize(300,300);
		f.show();
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == "rb1")
		{
			if(e.getStateChange() == 0)
			{
				l.setText("rb1 selected");
			}
		}
		else
		{
			if(e.getStateChange() == 1)
			{
				l.setText("rb2 selected");
			}
		}
	}
}