import java.awt.event.*;
import javax.swing.*;
class JtoggleButton extends JFrame implements ItemListener
{
	static JTextField t;
	static JFrame f;
	static JLabel l;
	static JToggleButton b;

	JtoggleButton(){}

	public static void main(String args[])
	{
		f = new JFrame("text field");
		l = new JLabel("nothing entered");
		b = new JToggleButton("ON");
		t = new JTextField(16);

		JtoggleButton jt = new JtoggleButton();
		JPanel p = new JPanel();

		// b.setBounds(300,500,220,30);
		b.addItemListener(jt);

		p.add(t);
		p.add(b);
		p.add(l);

		f.add(p);

		f.setSize(300,300);

		f.show();
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(b.isSelected())
		{
			b.setText("OFF");
		}
		else
		{
			b.setText("ON");
		}
	}
}