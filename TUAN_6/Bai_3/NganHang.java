package Bai_3;

import java.util.Scanner;

public class NganHang {
	public String soTaiKhoan;
	public String chuTaiKhoan;
	public double soDu;
	double soTienGui;
	double soTienRut;
	Scanner sc = new Scanner(System.in);
	
	
	public void Nhap() {
		
		System.out.println("Nhap vao stk: ");
		this.soTaiKhoan = sc.nextLine();
		System.out.println("Nhap ten chu tai khoan: ");
		this.chuTaiKhoan = sc.nextLine();
		System.out.println("Nhap vao so du: ");
		this.soDu = sc.nextDouble();
	}
	public void guiTien() {
		System.out.print("Nhap vao so tien gui:  ");
		this.soTienGui = sc.nextDouble();
		if(soTienGui> 0)
		{
			soDu = soDu + soTienGui;
			System.out.println("Da gui so tien: " +soTienGui+ " dong vao tai khoan " +soTaiKhoan+ ", " +chuTaiKhoan);
		}
		else
			System.out.println("So tien gui vao phai lon hon 0!");
			
	}
	public void rutTien() {
		System.out.print("Nhap vao so tien ban muon rut:  ");
		this.soTienRut = sc.nextDouble();
		if(soTienRut>soDu && soTienRut>0)
		{
			soDu = soDu - soTienRut;
			System.out.println("Da rut " +soTienRut+ "dong khoi tai khoan "+soTaiKhoan+ ", " +chuTaiKhoan);
		}
			
		else	
			if(soTienRut<0)
			System.out.println("Khong hop le!");
			else
				System.out.println("Khong hop le!");
	}
	public void kiemTraSoDu() {
		System.out.println("So du hien tai cua tai khoan: " +soTaiKhoan+ ", "+chuTaiKhoan+ " la: "+soDu+ " dong");
		
	}
}
