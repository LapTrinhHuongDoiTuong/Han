import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class BAITAP4 {
	public static void main(String[] args) {
		long soTienGui;
		double laiSuat;
		int soThangGui;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao lan luot so tien gui, lai suat hang nam va so thang gui: ");
		soTienGui = sc.nextLong();
		laiSuat = sc.nextDouble();
		soThangGui = sc.nextInt();
		double soTienLai = (soTienGui*laiSuat*soThangGui)/(12*100);
		System.out.println("So tien lai la: "+soTienLai);
		double tienGocCuoiKy = soTienGui+soTienLai;
		System.out.println("So tien goc cuoi ky la: "+tienGocCuoiKy);
		
	}
}
