package TugasKuis;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class Jframe extends JFrame{

	private static final int LEBAR = 350;
	private static final int TINGGI=200;
	private static final int POS_X=150;
	private static final int POS_Y=250;
	ProductTable tb = new ProductTable();
	
	private Jframe(String judul)
	{
		super(judul);
		setSize(LEBAR,TINGGI);
		setLocation(POS_X,POS_Y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton tombolCari = new JButton("Cari");
		Container panel = getContentPane();
		panel.setLayout(new FlowLayout());
		
		//label Product ID
		JLabel LIDProduct = new JLabel("ID Product");
		panel.add(LIDProduct);
		
		//txtBox ID
		JTextField txtIDProduct = new JTextField(16);
		panel.add(txtIDProduct);
		
		//Button Cari
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(tombolCari);
		
		//label Nama Product
		JLabel LNama = new JLabel("Nama Product");
		panel.add(LNama);
		
		//txtBox Nama
		JTextField txtNama = new JTextField(20);
		panel.add(txtNama);
		
		//label Nama Product
		JLabel LHarga = new JLabel("Harga Product");
		panel.add(LHarga);
		
		//txtBox Nama
		JTextField txtHarga = new JTextField(20);
		panel.add(txtHarga);
		
	}

	public static void main(String[] args) {
		Jframe frame = new Jframe("Cari Product");
		frame.setVisible(true);

	}

}
