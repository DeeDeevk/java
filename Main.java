package hoadonkhachsan;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		try {
			DanhSachHoaDon ds = new DanhSachHoaDon(2);
			ds.add(new HoaDonTheoGio(1, LocalDate.of(2023, 10, 14), "Nguyen Ho Viet Khoa", 22, 500000, 8));
			ds.add(new HoaDonTheoNgay(2, LocalDate.of(2023, 10, 3), "Ho Truong Bao", 44, 1000000, 6));
			System.out.println(HoaDon.tieuDe());
			System.out.println(ds);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
