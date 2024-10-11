import java.util.Scanner;

public class Bai_3 {
	static int N;
	static int []M;
	static Scanner sc;
	
	static void Nhap(Scanner sc) {
		for (int i=0; i<N; i++)
		{
			System.out.println("M["+i+"]=");
			M[i] = sc.nextInt();
		}
	}
	static void Xuat () {
		System.out.println("Truoc khi sap xep: ");
		for (int i=0; i<N; i++)
		{
			System.out.println(M[i]);
		}
	}
	static void SapXep() {
		for (int i=0; i<N-1; i++)
		{
			for (int j=i+1; j<N; j++)
			{
				if (M[i]>M[j])
				{
					int tg = M[i];
					M[i] = M[j];
					M[j] = tg;
				}
			}
		}
		System.out.println("Sau khi sap xep: ");
		for (int i=0; i<N; i++) {
			System.out.println(M[i]);
		}
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu trong mang: ");
		N = sc.nextInt();
		M = new int [N];
		Nhap(sc);
		Xuat();
		SapXep();
	}
}

