package p0614;

import java.util.Scanner;

public class C0614_13 {

	public static void main(String[] args) {
//		float pi = 3.141592f;
//		float shortPi = (int)(pi*1000)/1000f;
//		System.out.println(shortPi);
		
		// 입력한 숫자를 소수점 2자리에서 절사
		Scanner scan = new Scanner(System.in);
		System.out.println("소수 입력 : ");
		double num = scan.nextDouble();
//		double shortNum = (int)(num*100)/100d; // 절사(floor)
//		double shortNum = Math.round(num*100)/100d; // 소수점 3번째 자리에서 반올림(round)
//		double shortNum = Math.ceil(num*100)/100d; // 소수점 3번째 자리에서 올림(ceil)
		double shortNum = Math.floor(num*100)/100d; // 소수점 3번째 자리에서 버림(floor)
		System.out.println(shortNum);
		
		

	} // main

} // class
