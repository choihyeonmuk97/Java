package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
//		Math.random(); // 0.0 ~ 0.9999... 
//		System.out.println(Math.random());
//		
//		// 1~10 랜덤숫자 출력
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//		
//		// 1~100
//		int n2 = (int)(Math.random()*100)+1;
//		System.out.println(n2);
//		
//		// 0~4
//		int n3 = (int)(Math.random()*5);
//		System.out.println(n3);
//		
//		// 0~19
//		int n4 = (int)(Math.random()*20);
//		System.out.println(n4);
//		
//		// 2~10
//		int n5 = (int)(Math.random()*9)+2;
//		System.out.println(n5);
//		
//		// 1~100 랜덤으로 생성
//		int n = (int)(Math.random()*100)+1;
//		System.out.println(n);
//		
//		// 1~3
//		int n2 = (int)(Math.random()*3)+1;
//		System.out.println(n2);
//		
//		// 1~45
//		int n3 = (int)(Math.random()+45)+1;
//		System.out.println(n3);
		
		// 1~10 랜덤 생성 후 일치하는지?
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int in = scan.nextInt();
		int r = (int)(Math.random()*10)+1;
		
		if(in == r) System.out.println("일치 "+r);
		else System.out.println("불일치 "+r);
		
	} // main

} // class
