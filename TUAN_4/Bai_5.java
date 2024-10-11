import java.util.Scanner;

public class Bai_5 {
	public static void main(String[] args) {
		int x, y, a, b, UCLN, BCNN;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao hai so x, y: ");
		x = sc.nextInt();
		y = sc.nextInt();
		a = Math.abs(x);
		b = Math.abs(y);
		while(a!=b && a*b!=0)
		{
			if (a>b) 
				a = a-b;
			else
				b = b-a;
		}
		if (a*b == 0)
		{
			UCLN = a+b;
			System.out.println("UCLN cua "+x+" va "+y+" la "+UCLN);
			BCNN = Math.abs(x*y)/(a+b);
			System.out.println("BCNN cua "+x+" va "+y+" la "+BCNN);

		}
		else
		{
			UCLN = a;
			System.out.println("UCLN cua "+x+" va "+y+" la "+UCLN);
			BCNN = Math.abs(x*y)/a;
			System.out.println("BCNN cua "+x+" va "+y+" la "+BCNN);

		}
	}
}
