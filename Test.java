
public class Test {
	public static void main(String[] args) {
		Ngay md = new Ngay(15, 6, 2021);
		Ngay md1 = new Ngay(21, 7, 2015);
		
		Author author1 = new Author("Nguyen B", md);
		Author author2 = new Author("Nguyen A", md1);
		
		Book Sach1 = new Book(5000, "Harry Poter", 2018, author1);
		Book Sach2 = new Book(15000, "ATSH", 2018, author2);
		
		Sach1.IntenSach();
		Sach2.IntenSach();
		
		System.out.println("So sanh NXB cua sach 1 va 2 " +Sach1.KTnxb(Sach2));
		
		System.out.println("Sach 1 giam gia 10% :"+ Sach1.GiaSauKhiGiam(10));
		System.out.println("Sach 2 giam gia 15% :"+ Sach2.GiaSauKhiGiam(15));
		
	}
}
