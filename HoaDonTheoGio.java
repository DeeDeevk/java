package hoadonkhachsan;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
	private double soGioThue;

	public HoaDonTheoGio() {
		super();
	}

	public HoaDonTheoGio(int maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, int maPhong, double donGia, double soGioThue) throws Exception {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		setSoGioThue(soGioThue);
	}

	public double getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(double soGioThue) throws Exception {
		if(soGioThue < 30) {
			this.soGioThue = soGioThue;
		}
	}
	
	public double thanhTien() {
		if(soGioThue > 24 && soGioThue < 30) {
			return 24 * getDonGia();
		}
		else {
			return soGioThue * getDonGia();
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" %-10.2f %-10.2f", soGioThue, thanhTien());
	}
}
