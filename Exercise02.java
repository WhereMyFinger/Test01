package test01;

import java.util.Scanner;

public class Exercise02 {
	public static final int Muc_Tieu_Thu_1 = 25000;
	public static final int Muc_Tieu_Thu_2 = 87500;
	public static final int Muc_Tieu_Thu_3 = 222500;
	public static void caculateElectricityBill(int a) {
		int s = 0;
		if(a > 0 && a < 25) {
			s = a*1000; 
		}
		if(a > 25 && a < 75) {
			s = (a-25)*1250 + Muc_Tieu_Thu_1;
		}
		if(a > 75 && a < 150) {
			s = (a-75)*1800 + Muc_Tieu_Thu_2 + Muc_Tieu_Thu_1;
		}
		if(a > 150) {
			s = (a-150)*2500 + Muc_Tieu_Thu_3 + Muc_Tieu_Thu_2 + Muc_Tieu_Thu_1; 
		}
		System.out.println("So tien phai tra la: " + s);
	}
	
	public static void main(String[] agrs) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap muc tieu thu: ");
		a = scanner.nextInt();
		
		caculateElectricityBill(a);
	}

}
