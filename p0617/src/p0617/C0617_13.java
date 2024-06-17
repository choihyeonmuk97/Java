package p0617;

import java.util.Scanner;

public class C0617_13 {

	public static void main(String[] args) {
		// if, switch
		// 두 수를 입력 받아서 사칙연산 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scan.nextInt();
		System.out.println("숫자를 입력하세요");
		int n2 = scan.nextInt();
		
		System.out.println("1.+ 2.- 3.* 4./");
		System.out.println("원하는 번호 입력하기");
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1 :
			System.out.println("더하기 : "+(n+n2));
			break;
		case 2 :
			System.out.println("빼기 : "+(n-n2));
			break;
		case 3 :
			System.out.println("곱하기 : "+(n*n2));
			break;
		case 4 :
			System.out.println("나누기 : "+(n/n2));
			break;
		default:
			System.out.println("잘못 입력");
			break;
		
		}

	} // main

} // class
