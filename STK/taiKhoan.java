package STK;

import java.util.Scanner;

public class taiKhoan {
	
	public String soTaiKhoan;
	public String chuTaiKhoan;
	private double soDu =0;
	private String MK;
	
	double soTienGui;
	double soTienRut;
	Scanner sc = new Scanner(System.in);
	
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}
	public String getChuTaiKhoan() {
		return chuTaiKhoan;
	}
	public void setChuTaiKhoan(String chuTaiKhoan) {
		this.chuTaiKhoan = chuTaiKhoan;
	}
	public String getMK() {
		return MK;
	}
	public void setMK(String mK) {
		MK = mK;
	}
	public taiKhoan(String soTaiKhoan, String chuTaiKhoan, String mK) {
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		MK = mK;
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
		if(soTienRut<=soDu && soTienRut>0)
		{
			soDu = soDu - soTienRut;
			System.out.println("Da rut " +soTienRut+ "dong khoi tai khoan "+soTaiKhoan+ ", " +chuTaiKhoan);
		}
			
		else
			System.out.println("Khong hop le!");
	}
	public void kiemTraSoDu() {
		System.out.println("So du hien tai cua tai khoan: " +soTaiKhoan+ ", "+chuTaiKhoan+ " la: "+soDu+ " dong");
		
	}
	public void doiMK() {
		String matKhau, MKmoi, kTra, kTraMoi;
		System.out.println("Nhap mat khau cu: ");
		sc.nextLine();
		kTra = sc.nextLine();
		if(kTra.equals(this.MK))
		{
			System.out.println("Nhap mat khau moi: ");
			MKmoi = sc.nextLine();
			System.out.println("Nhap lai may khau moi: ");
			kTraMoi = sc.nextLine();
			if (kTraMoi.equals(MKmoi))
			{
				this.MK = MKmoi;
				System.out.println("Đổi mật khẩu thành công!");
			}
				
			else
				System.out.println("Khong trung khop mau khau moi!");
		}
			
		else
			System.out.println("Mat khau cu khong dung!");
			
				
	}
}

