
public class Author {
	private String nameAuthor;
	private Ngay NgaySinh;
	public Author(String nameAuthor, Ngay ngaySinh) {
		this.nameAuthor = nameAuthor;
		NgaySinh = ngaySinh;
	}
	public String getNameAuthor() {
		return nameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
	public Ngay getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		NgaySinh = ngaySinh;
	}
	
	
}
