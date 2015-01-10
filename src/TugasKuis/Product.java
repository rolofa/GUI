package TugasKuis;

public class Product {

	private String ID;
	private String nama;
	private String IDSupplier;
	private int Harga;
	
	public Product(String ID, String nama, String IDSupplier, int Harga)
	{
		this.ID = ID;
		this.nama = nama;
		this.IDSupplier = IDSupplier;
		this.Harga = Harga;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		ID = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getIDSupplier() {
		return IDSupplier;
	}
	public void setIDSupplier(String idSupplier) {
		IDSupplier = idSupplier;
	}
	public int getHarga() {
		return Harga;
	}
	public void setHarga(int harga) {
		Harga = harga;
	}
	
}
