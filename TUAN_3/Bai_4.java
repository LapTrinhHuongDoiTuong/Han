import java.util.Scanner;

public class Bai_4 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao lan luot 3 so nguyen a, b, c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int min = a;
		if (b<min)
			min =b;
		if (c<min)
			min = c;
		System.err.println("So nho nhat la: "+min);
	}
}
