package hoadonkhachsan;

import java.time.LocalDate;

public class HoaDon {
	private int maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKhachHang;
	private int maPhong;
	private double donGia;
	
	public HoaDon() {
		super();
	}

	public HoaDon(int maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, int maPhong, double donGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayHoaDon = ngayHoaDon;
		this.tenKhachHang = tenKhachHang;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}

	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public static String tieuDe() {
		return String.format("%-20s %-20s %-20s %-10s %-10s" , "Ma hoa don" , "Ngay hoa don",
								"Ten khach hang", "Ma phong", "Don gia");
	}
	
	@Override
	public String toString() {
		return String.format("%-20d %-20s %-20s %-10d %-10.1f " , maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia );
	}
}
