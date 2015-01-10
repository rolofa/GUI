package TugasKuis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MntProduct extends JFrame
{
	private JPanel PANEL_ATAS = new JPanel();
	private JPanel PANEL_BAWAH = new JPanel();
	private JPanel PANEL_KIRI = new JPanel();
	private JPanel PANEL_CARI = new JPanel();
	private JButton BUTTON_CARI = new JButton();
	private JButton BUTTON_ADD = new JButton();
	private JButton BUTTON_VIEWALL = new JButton();
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public MntProduct(String Judul)
	{
		super(Judul);
		Container kontainer = getContentPane();
		kontainer.setLayout(new BorderLayout());
		JLabel labelJudul = new JLabel("<HTML><H1>Program Maintenance Data Product</H1></HTML>");
		JLabel labelFooter = new JLabel("<HTML><H5>Copyright IBIS Surabaya</H5></HTML>");
		JLabel labelAdd = new JLabel("<HTML><H3>Tambah Data</H3></HTML>");
		JLabel labelCari = new JLabel("<HTML><H3>Cari Data</H3></HTML>");
		JLabel labelView = new JLabel("<HTML><H3>Lihat Semua Data</H3></HTML>");
		labelJudul.setForeground(Color.ORANGE);
		labelFooter.setForeground(Color.ORANGE);
		labelAdd.setForeground(Color.WHITE);
		labelCari.setForeground(Color.WHITE);
		labelView.setForeground(Color.WHITE);
		
		BUTTON_CARI.setBackground(Color.DARK_GRAY);
		BUTTON_ADD.setBackground(Color.DARK_GRAY);
		BUTTON_VIEWALL.setBackground(Color.DARK_GRAY);
		BUTTON_CARI.add(labelCari);
		BUTTON_ADD.add(labelAdd);
		BUTTON_VIEWALL.add(labelView);
		
		PANEL_ATAS.setBackground(Color.GRAY);
		PANEL_ATAS.add(labelJudul);
		
		PANEL_BAWAH.setBackground(Color.DARK_GRAY);
		PANEL_BAWAH.add(labelFooter);
		
		PANEL_KIRI.setBackground(Color.lightGray);
		PANEL_KIRI.add(BUTTON_CARI);
		PANEL_KIRI.add(BUTTON_ADD);
		PANEL_KIRI.add(BUTTON_VIEWALL);
		
		kontainer.add(PANEL_ATAS,BorderLayout.NORTH);
		kontainer.add(PANEL_BAWAH,BorderLayout.SOUTH);
		kontainer.add(PANEL_KIRI,BorderLayout.WEST);
		setSize(700,700);
		setLocation((screenSize.width - getWidth()) / 2,
				(screenSize.height - getHeight()) / 2);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		BUTTON_CARI.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) {
				kontainer.add(PANEL_CARI, BorderLayout.CENTER);
			}
		});
	}
	
	public static void main(String[] args) {
		String Judul = "Mantenance Product";
		MntProduct frame = new MntProduct(Judul);
		frame.setVisible(true);
	}
}
