package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		// 주민번호 앞자리를 입력받아 출생 계절을 출력
		Scanner scan = new Scanner(System.in);
		
//		String str = "990123";
//		String birthM = str.substring(2,4);
//		System.out.println(birthM);
		
//		System.out.println(birthM);
		System.out.println("주민번호 입력 : ");
		String str = scan.nextLine();
		
		// 나이 출력 (1,2 : 1900 / 3,4:2000)
		String year = str.substring(0,2);
		String cent = str.substring(7,8);
		
		int age = 0;
		
		switch(cent) {
		
		case "1": case "2":
			age = 2024 - Integer.parseInt("19"+year);
			System.out.println(age);
			break;
		
		case "3": case "4":
			age = 2024 - Integer.parseInt("20"+year);
			System.out.println(age);
			break;		
		}
		
		
		
		
//		String birthM = str.substring(2,4);
//		switch (birthM) {
//		
//		case "12": case "01": case "02":
//			System.out.println("겨울");
//			break;
//		
//		case "03": case "04": case "05":
//			System.out.println("봄");
//			break;
//		
//		case "06": case "07": case "08":
//			System.out.println("여름");
//			break;
//		
//		case "09": case "10": case "11":
//			System.out.println("가을");
//			break;
//		} // switch

		
		
		
	} // main

} // class
