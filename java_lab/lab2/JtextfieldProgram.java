import java.awt.event.*;
import javax.swing.*;
class JtextfieldProgram extends JFrame implements ActionListener
{
	static JTextField t;
	static JFrame f;
	static JLabel l;
	static JButton b;

	JtextfieldProgram(){}

	public static void main(String args[])
	{
		f = new JFrame("text field");
		l = new JLabel("nothing entered");
		b = new JButton("submit");
		t = new JTextField(16);

		JtextfieldProgram jt = new JtextfieldProgram();
		JPanel p = new JPanel();

		// b.setBounds(300,500,220,30);
		b.addActionListener(jt);



		p.add(t);
		p.add(b);
		p.add(l);

		f.add(p);

		f.setSize(300,300);

		f.show();
	}

	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("submit"))
		{
			l.setText(t.getText());

			t.setText(" ");
		}
	}
}