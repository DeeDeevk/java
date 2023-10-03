package hoadonkhachsan;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
	private double soNgayThue;

	public HoaDonTheoNgay() {
		super();
	}

	public HoaDonTheoNgay(int maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, int maPhong, double donGia, double soNgayThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	public double getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(double soNgayThue) {
		this.soNgayThue = soNgayThue;
	}
	
	public double thanhTien() {
		if(soNgayThue > 7) {
			double soNgayCon = soNgayThue - 7;
			return 7 * getDonGia() + (soNgayCon * getDonGia()) * 0.8; 
		}
		else {
			return soNgayThue * getDonGia();
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" %-10.2f %-10.2f", soNgayThue, thanhTien());
	}
}
