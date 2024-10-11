import java.util.Scanner;

public class Bai_3 {
	public static void main(String[] args) {
		int a, b, c, d ;
		double x, x1, x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao lan luot a, b, c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = b*b - 4*a*c;
		if (d<0)
			System.out.println("Vo nghiem");
		else
			if (d==0)
			{
				x =-b/2*a;
				System.out.println("Phuong trinh co nghiem kep x = "+x);
			}
			else
			{
				x1 = (-b-Math.sqrt(d))/(2*a);
				x2 = (-b+Math.sqrt(d))/(2*a);
				System.out.println("x1 = " + x1 + " x2 = "+ x2);
			
			}
	}
}
