import java.util.Scanner;

public class Bai_1 {
	public static void main(String[] args) {
		int so;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập vào một số nguyên: ");
		so = sc.nextInt();
		if (so<0)
			System.out.println(so+ " la so am");
		else if(so>0)
			System.out.println(so+ " la so duong");
		else
			System.out.println(so+ " bang 0");
	}
}
