import java.util.Scanner;

public class Bai_6{
	public static void main(String[] args) {
		int a, b;
		double kq;
		char pt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 2 so nguyen a, b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Lua chon phep tinh: ");

		
		pt = sc.next().charAt(0);
		
		switch(pt)
		{
		case '+': kq = a+b;
		System.out.println("Kết quả: " +kq);
		break;
		case '-': kq = a-b;
		System.out.println("Kết quả: " +kq);
		break;
		case '*': kq = a*b;
		System.out.println("Kết quả: " +kq);
		break;
		case '/': kq = a*1.0/b; 
		System.out.println("Kết quả: " +kq);
		break;

		}
		
		
	}
}
