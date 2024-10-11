import java.util.Scanner;

public class Bai_5 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao lan luot 3 canh tam giac a, b, c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a + b > c && a + c > b && b + c > a) 
            if (a == b && b == c) 
                System.out.println("Tam giác đều");
             else if (a == b || b == c || a == c) 
                System.out.println("Tam giác cân");
             else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) 
                System.out.println("Tam giác vuông");
             else 
                System.out.println("Tam giác thường");
            
         else 
            System.out.println("Ba cạnh không tạo thành tam giác");
        
	}
}
