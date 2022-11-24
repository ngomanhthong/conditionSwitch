package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// 10.3.Viết chương trình nhập vào tháng trong năm.In ra sốngày của
		// tháng đó
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n = sc.nextInt();
		switch (n) {
		case 1,3,5,7,8,10,12:
			System.out.println("co 31 ngay");
			break;
		case 4,6,9,11:
			System.out.println("co 30 ngay");
		break;
		case 2:
			System.out.println("thang nhuan");
			break;
		default:
			System.out.println("nhap du lieu sai");
			break;
		}

	}
}
