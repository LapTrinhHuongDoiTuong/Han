import java.util.Scanner;

public class Bai_3 {
	public static void main(String[] args) {
		int i, n;
		long giaithua;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		n = sc.nextInt();
		giaithua = 1;
		for (i=1; i<=n; i++)
		{
			giaithua = giaithua*i;
		}
		System.out.println(+n+"! = "+giaithua);
	}
}
