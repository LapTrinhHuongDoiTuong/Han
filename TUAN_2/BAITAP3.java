import java.util.Scanner;

public class BAITAP3 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhao vao a: ");
		a = sc.nextInt();
		System.out.println("Nhap vao b: ");
		b = sc.nextInt();
		
		int tong = a+b;
		System.out.println("Tong: "+tong);
		int hieu = a-b;
		System.out.println("Hieu: "+hieu);
		int tich = a*b;
		System.out.println("Tich: "+tich);
		double thuong = a*1.0/b;
		System.out.println("Thuong: "+thuong);
		int du = a%b;
		System.out.println("Phan du: "+du);
	}
}
