import java.util.Scanner;

public class Bai_1 {
	public static void main(String[] args) {
		int n, tong, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		n = sc.nextInt();
		tong = 0;
		for (i=1; i<=n; i++)
			tong = tong +i;
			System.out.println("Tong tu 1 den "+n+ " la: "+tong);
	}
}
