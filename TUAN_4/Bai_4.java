import java.util.Scanner;

public class Bai_4 {
	static int i;
	static int n;
	static Scanner sc;
	
	static int KiemTra() 
	{
		if (n<2)
			return 0;
		for(i=2; i<= Math.sqrt(n); i++)
			if (n%i==0)
				return 0;
		return 1;
	}
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.print("Nhap vao n: ");
		n = sc.nextInt();
		if (KiemTra()==0)
			System.out.println(+n+" khong phai la so nguyen to");
		else
			System.out.println(+n+" la so nguyen to");
	}
}