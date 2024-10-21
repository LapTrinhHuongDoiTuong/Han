package STK;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String chuTaiKhoan;
		String soTaiKhoan;
		String MK;
	
		
		System.out.println("Nhap vao stk: ");
		soTaiKhoan = sc.nextLine();
		System.out.println("Nhap ten chu tai khoan: ");
		chuTaiKhoan = sc.nextLine();
		System.out.println("Nhập mật khẩu: ");
		MK = sc.nextLine();
		taiKhoan tk1 = new taiKhoan(soTaiKhoan, chuTaiKhoan, MK);
		System.out.println("-----------");
		tk1.guiTien();
		tk1.kiemTraSoDu();
		System.out.println("-----------");
		tk1.rutTien();
		tk1.kiemTraSoDu();
		System.out.println("-----------");
		tk1.doiMK();
		
	}
	
	
}
