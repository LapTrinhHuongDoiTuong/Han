import java.util.Scanner;

public class Bai_6 { 
	static int [] M;
	static int N;
	static Scanner sc;
	static int gt;
	static int vt;
	
	
	static void Nhap()
	{
		for (int i=0; i<N; i++)
		{
			System.out.print("M["+i+" ]=");
			M[i]=sc.nextInt();
		}
	}
	
	static void XuatChen() 
	{
		System.out.print("Nhap gia tri chen: ");
			gt = sc.nextInt();
		System.out.print("Vi tri chen: ");
			vt = sc.nextInt();	
		
	}
	static void XuatXoa() 
	{
		System.out.print("Vi tri Xoa: ");
			vt = sc.nextInt();	
		
	}
	static void ChenPhanTu() {
		M = java.util.Arrays.copyOf(M, N + 1);
		for (int i=N-1; i>=vt; i--) {
			M[i+1] = M[i];
		}
		M[vt] =gt; 
		N++;
		System.out.println("Sau khi chen: ");
		for (int i=0; i<N; i++) {
			System.out.println("M["+i+"]=" +M[i]);
		}
	}
	static void XoaPhanTu(int vt) {
		for (int i=vt; i<M.length - 1; i++) {
			M[i] = M[i+1];
		}
		//N--;
		System.out.println("Sau khi xoa: ");
		for (int i=0; i<M.length - 1; i++) {
			System.out.println("M["+i+"]=" +M[i]);
		}
	}
	
	public static void main(String[] args) {
		 sc = new Scanner (System.in);
		 System.out.print("Nhap vao so phan tu: ");
		 	N = sc.nextInt();
			M = new int [N];
		 Nhap();
		 XuatChen();
		 ChenPhanTu();
		 System.out.println("*********");
		 System.out.print("Nhap vao so phan tu: ");
		 	N = sc.nextInt();
			M = new int [N];
		 Nhap();
		 XuatXoa();
		 XoaPhanTu(vt);
	}
	
}
