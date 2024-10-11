package Bai_2;

import java.util.Scanner;

public class SinhVien {
	public String maSV;
	public String hoTen;
	public String ngaySinh;
	double diemTB;
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		this.maSV = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.println("Nhap diem trung binh: ");
		this.diemTB = sc.nextDouble();
		
	}
	public void Xuat() {
		System.out.println("Ma sinh vien: "+this.maSV);
		System.out.println("Ho ten: "+this.hoTen);
		System.out.println("Ngay sinh: "+this.ngaySinh);
		System.out.println("Diem trung binh: "+this.diemTB);
	}
}
