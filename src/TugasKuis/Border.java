package TugasKuis;

import java.awt.*;
import javax.swing.*;

public class Border extends JFrame
{
	private JButton nb = new JButton ("North Button");
	private JButton sb = new JButton ("South Button");
	private JButton eb = new JButton ("East Button");
	private JButton wb = new JButton ("West Button");
	private JButton cb = new JButton ("Center Button");
	
	public Border()
	{
		setLayout(new BorderLayout());
		add(nb, BorderLayout.NORTH);
		add(sb, BorderLayout.SOUTH);
		add(eb, BorderLayout.EAST);
		add(wb, BorderLayout.WEST);
		add(cb, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] argv) 
	{
		Border frame = new Border();
		frame.setSize(400, 200);
		frame.setVisible(true);
	}

}
