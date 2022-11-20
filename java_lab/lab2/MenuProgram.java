import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuProgram extends JFrame
{
	static JFrame f;
	static JMenu m;
	static JMenuBar mb;
	static JMenuItem m1,m2,m3;

	public static void main(String args[])
	{
		f = new JFrame("Menu bar");
		m = new JMenu("Menu");
		mb = new JMenuBar();

		m1 = new JMenuItem("hell");
		m2 = new JMenuItem("man");
		m3 = new JMenuItem("ehlll");

		m.add(m1);
		m.add(m2);
		m.add(m3);

		mb.add(m);

		f.add(mb);

		f.setSize(300,300);
		f.show();
		f.setVisible(true);
	}
}