import java.util.Scanner;

public class Bai_4 {
	static int n;
	static int []M;
	static Scanner sc;
	
	static void Nhap() {
		for (int i=0; i<n; i++)
		{
			System.out.println("M["+i+"]=");
			M[i] = sc.nextInt();
		}
	}
	static void Xuat() {
		for (int i=0; i<n; i++)
		{
			System.out.println("M["+i+"]="+M[i]);
		}
	}
	static void Tim() {
		int max = 0;
		int so = M[0];
		for(int i = 0; i < n; i++) {
			int dem = 0;
			for(int j = 0; j < n; j++) {
				if(M[i] == M[j]) {
					dem++;
				}
			}
			if(dem > max) {
				max = dem;
				so = M[i];
			}
		}
		System.out.println("phan tu xuat hien nhieu nhat là : " + so);
		System.out.println("So lan xuat hien: "+max);
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu mang: ");
		n = sc.nextInt();
		M = new int [n];
		Nhap();
		Xuat();
		Tim();
	}
}
