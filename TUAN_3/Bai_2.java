import java.util.Scanner;

public class Bai_2 {
	public static void main(String[] args) {
		float diemTB;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao diem trung binh: ");
		diemTB = sc.nextFloat();
		if (diemTB<5)
			System.out.println("Xếp loại yếu");
		else
			if (diemTB<6.5)
				System.out.println("Xếp loại trung bình");
			else
				if (diemTB<8.5)
					System.out.println("Xếp loại khá");
				else
					System.out.println("Xếp loại giỏi");




	}
}
