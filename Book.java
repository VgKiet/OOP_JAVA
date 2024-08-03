
public class Book {
	private double price;
	private String TenSach;
	private int NXB;
	private Author Tacgia;
	public Book(double price, String tenSach, int nXB, Author tacgia) {
		super();
		this.price = price;
		TenSach = tenSach;
		NXB = nXB;
		Tacgia = tacgia;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTenSach() {
		return TenSach;
	}
	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}
	public int getNXB() {
		return NXB;
	}
	public void setNXB(int nXB) {
		NXB = nXB;
	}
	public Author getTacgia() {
		return Tacgia;
	}
	public void setTacgia(Author tacgia) {
		Tacgia = tacgia;
	}

	public void IntenSach() {
		System.out.println(this.TenSach);
	}
	
	public boolean KTnxb(Book sachkhac) {
//		if(this.NXB == sachkhac.NXB)
//			return true;
//		return false;
		return this.NXB == sachkhac.NXB;
	}
	
	public double GiaSauKhiGiam(double x) {
		return this.price*(1-x/100); 
		
	}
	
}
