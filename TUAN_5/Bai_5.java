import java.util.Scanner;

public class Bai_5 {
	static int n;
	static int []M;
	static Scanner sc;
	
	static void Nhap() {
		System.out.println("Nhap cac phan tu: ");
		for (int i=0; i<n; i++)
		{
			
			M[i] = sc.nextInt();
		}
	}
	static void Xuat() {
		System.out.println("Danh sach cac so nguyen: ");
		for (int i=0; i<n; i++) {
			System.out.print(M[i]+" ");		
			}
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu mang: ");
		n = sc.nextInt();
		M = new int [n];
		Nhap();
		Xuat();
	}
}
