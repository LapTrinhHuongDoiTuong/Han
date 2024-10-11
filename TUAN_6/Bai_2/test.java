package Bai_2;

import java.io.InputStream;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		SinhVien [] danhsachSV = new SinhVien[n];
		for (int i=0; i<n; i++)
		{
			danhsachSV [i] = new SinhVien();
			danhsachSV [i].Nhap();
		}
		for (int i=0; i<n; i++) 
		{
			danhsachSV[i].Xuat();
			System.out.println("------------");
		}  
			
		for (int i=0; i<n-1; i++) 
			for(int j=i+1; j<n; j++ ) {
				if( danhsachSV[j].diemTB>danhsachSV[i].diemTB) {
					SinhVien tg = danhsachSV[i];
					danhsachSV[i] = danhsachSV[j];
					danhsachSV[j] = tg;
				}
			}
		System.out.println("Danh sach giam dan: ");
		for (int i=0; i<n; i++)
		{
			danhsachSV[i].Xuat();
			System.out.println("------------");
		}
			
//		SinhVien sv1 = new SinhVien();

	}

}

