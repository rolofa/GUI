package TugasKuis;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProductTable {
	
	
	Connection connection;
	public ProductTable()
	{
		try{
			Class.forName(config.DATABASE_DRIVER).newInstance();
			connection = DriverManager.getConnection(config.URL, config.USERNAME, config.PASSWORD);
		}catch (Exception e)
		{
			
		}
	}
	
	public Product cariById(String id)
	{
		Product pHasil = null;
		try{
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products where ID = '"+ id +"'");
			while (rs.next())
			{
				String nama = rs.getString(2);
				String idSupplier = rs.getString(3);
				int harga = rs.getInt(4);
				pHasil = new Product (id, nama, idSupplier, harga);
			}
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		return pHasil;
	}
	public List<Product> viewAll()
	{
		List <Product> daftarProduct = new ArrayList<Product>();
		try
		{
			//rs=selectAll.executeQuery();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products");	
			while(rs.next())
			{
				//daftarProduct.add(new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return daftarProduct;
	}
	public List<Product> viewAll(String filter)
	{
		return null;
	}
	public void insert(Product produk)
	{
		
	}
	public void delete(String id)
	{
		
	}
	public void update(String id,Product prodUpdated)
	{
		
	}
	/*public static void main (String []args) throws Exception
	{
		String id = JOptionPane.showInputDialog("Masukkan ID Product : ");
		ProductTable pt = new ProductTable();
		Product p1 = pt.cariById(id);
		System.out.println(p1);
		//List <Product> hasilAll = pt.viewAll();
		//for(Product p:hasilAll);
			//System.out.ptrintln(p);
	}*/
}
