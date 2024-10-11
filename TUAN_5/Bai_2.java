import java.util.Scanner;

public class Bai_2 {
	static int N;
	static int [] M;
	static Scanner sc;
	static void Nhap() {
		for (int i=0; i<N; i++)
		{
			System.out.println("M[" +i+ "] =");
			M[i] = sc.nextInt();
		}
	}
	static void Xuat() {
		System.out.println("Truoc khi dao nguoc: ");
		for (int i=0; i<N; i++)
		{
			System.out.print(" "+M[i]);
		}
		System.out.println("");
	}
	static void DaoNguoc() {
		System.out.println("Sau khi dao nguoc: ");
		for (int i=N-1; i>=0; i--) {
			System.out.print(" "+M[i]);
		}
	}
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.println("Nhap vao so phan tu mang: ");
		N = sc.nextInt();
		M = new int [N];
		Nhap();
		Xuat();
		DaoNguoc();
	}
}
