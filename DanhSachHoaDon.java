package hoadonkhachsan;

import java.util.Arrays;
import java.util.Objects;

public class DanhSachHoaDon {
	private HoaDon[] danhSach;
	int count;
	
	public DanhSachHoaDon(int n) {
		danhSach = new HoaDon[n];
		count = 0;
	}
	
	public boolean add(HoaDon hd) {
		if(count < danhSach.length) {
			danhSach[count++] = hd;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i < count; i++) {
			s += danhSach[i].toString() + "\n";
		}
		return s;
	}
	
	public int thongKeHDTheoGio() {
		int countTheoGio = 0;
		for(int i = 0; i < count; i++) {
			if(danhSach[i] instanceof HoaDonTheoGio) {
				countTheoGio ++;
			}
		}
		return countTheoGio;
	}
	
	public int thongKeHDTheoNgay() {
		int countTheoNgay = 0;
		for(int i = 0; i < count; i++) {
			if(danhSach[i] instanceof HoaDonTheoNgay) {
				countTheoNgay++;
			}
		}
		return countTheoNgay;
	}
}
