import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DialogProgram extends JFrame implements ActionListener
{
	static JFrame f;
	static JButton b;
	public static void main(String args[])
	{
		f = new JFrame("Dialog");
		b = new JButton("submit");
		DialogProgram dp = new DialogProgram();
		b.addActionListener(dp);

		JPanel p = new JPanel();
		p.add(b);
		f.add(p);
		f.setSize(300,300);
		f.show();
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b)
		{
			JOptionPane.showMessageDialog(this, "Enter a valid number", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}