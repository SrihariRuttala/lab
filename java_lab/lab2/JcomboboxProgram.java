import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JcomboboxProgram extends JFrame implements ItemListener
{
	static JFrame f;
	static JList l;
	static JLabel l1;
	static JComboBox c1;

	public static void main(String args[])
	{
		f = new JFrame("Combo box");

		JcomboboxProgram jc = new JcomboboxProgram();
		String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };
		l = new JList(s1);
		c1 = new JComboBox(s1);
		l1 = new JLabel("Label");
		c1.addItemListener(jc);

		JPanel p = new JPanel();
		p.add(c1);
		p.add(l1);
		f.add(p);
		f.setSize(300,300);
		f.show();

	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == c1)
		{
			l1.setText(c1.getSelectedItem() + " selected");
		}
	}
}