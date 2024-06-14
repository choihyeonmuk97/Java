package p0614;

import java.util.Scanner;

public class C0614_14 {

	public static void main(String[] args) {

		// 입력한 숫자가 양수인지, 음수인지 출력 (0은 양수로)
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :");
		int num = scan.nextInt();
		
		if (num >=0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}

		
//		int a = 10;
//		if (a > 0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}

//		if (a == 10) {
//			System.out.println("일치");
//		}else {
//			System.out.println("불일치");
//		} // if a == 10?
		
	} // main

} // class
