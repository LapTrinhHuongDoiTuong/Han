import java.util.Scanner;

public class Bai_1 {
	static int []M;
	static int N;
	static Scanner sc;
	
	static void Nhap() {
		for (int i=0; i<N; i++)
		{
			System.out.println("M["+i+"]=");
			M[i] = sc.nextInt();
		}
	}
	static void Xuat() {
		for (int i=0; i<N; i++)
		{
			System.out.println("M[i] = "+M[i]);
		}
	}
	static int Tong() {
		int tong = 0;
		for (int i=0; i<N; i++)
		{
			 tong  = tong + M[i];
		}
		return tong;
	}
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.println("Nhap vao so phan tu mang: ");
		N = sc.nextInt();
		M = new int [N];
		Nhap ();
		Xuat();
		System.out.println("Tong cac phan tu trong mang la: "+Tong());
	}
}
